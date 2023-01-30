
package fighting;

import badge.Badge;
import java.util.Scanner;
import monster.Pokemon;
import npc.People;
import npc.PokemonCenter;
import npc.User;
import thread.BGM;

public class Fighting_Boss {
    public Fighting_Boss() {
    }

    public void Fighting_Boss(User user, People you, Badge badge) {
        int cts = 0;
        BGM bgm = new BGM();
        String mp3bgm = "트레이너전투bgm.mp3";
        bgm.BGM(mp3bgm);
        bgm.start();
        Scanner sc = new Scanner(System.in);
        PokemonCenter nurse = new PokemonCenter();
        new Pokemon();
        new Pokemon();
        Pokemon You_pet = you.mypet[cts];
        Pokemon my_2 = user.choice();

        do {
            System.out.println("무엇울 하시겠습니까?");
            System.out.println("1.싸운다.");
            System.out.println("2.포켓몬변경.");
            System.out.println("3.도망간다.");

            int choice_1;
            for(choice_1 = sc.nextInt(); choice_1 < 1 || choice_1 > 3; choice_1 = sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            switch (choice_1) {
                case 1:
                    Fighting_tr fighting_tr = new Fighting_tr();
                    fighting_tr.Fighting_tr(my_2, You_pet);
                    if (!my_2.life) {
                        int vt = 0;

                        for(int i = 0; i < user.mypet.length; ++i) {
                            if (user.mypet[i] != null && user.mypet[i].life) {
                                ++vt;
                            }
                        }

                        if (vt <= 0) {
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("패배하였습니다.");
                            nurse.loss(user.mypet);
                            You_pet.dock_de = false;
                            You_pet = null;
                            my_2 = null;
                            you = null;
                            break;
                        }

                        System.out.println(my_2.name + "가 기절하였습니다.");
                        System.out.println("포켓몬을 선택하세요.");
                        my_2 = null;
                        my_2 = user.choice();
                        System.out.println(my_2.name + "으로 변경!!");
                    }

                    if (!You_pet.life) {
                        ++cts;
                        System.out.println(You_pet.name + "전투불가");
                        System.out.println("------------------------------------------------------------------------");
                        You_pet = null;
                        if (cts < 6) {
                            if (you.mypet[cts] != null) {
                                You_pet = you.mypet[cts];
                                System.out.println(You_pet.name + "으로 변경!!");
                                System.out.println("------------------------------------------------------------------------");
                            } else {
                                System.out.println(you.name + "에게 승리하였습니다.");
                                System.out.println("------------------------------------------------------------------------");
                                user.mony_in(you.money_give);
                                user.badgehave(badge);
                                my_2 = null;
                                you = null;
                            }
                        } else {
                            System.out.println(you.name + "에게 승리하였습니다.");
                            System.out.println("------------------------------------------------------------------------");
                            user.mony_in(you.money_give);
                            user.blue_badge.badge_have(true);
                            my_2 = null;
                            you = null;
                        }
                    }
                    break;
                case 2:
                    System.out.println("포켓몬을 선택하세요.");
                    my_2 = null;
                    my_2 = user.choice();
                    System.out.println(my_2.name + "으로 변경!!");
                    break;
                case 3:
                    You_pet.dock_de = false;
                    bgm.stop = false;
                    You_pet = null;
                    you = null;
                    my_2 = null;
            }
        } while(You_pet != null);

        bgm.stop = false;
    }
}
