//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fighting;

import java.util.Scanner;
import market.Catch;
import monster.Pokemon;
import npc.PokemonCenter;
import npc.User;
import thread.BGM;

public class Fighting_mon {
    public Fighting_mon() {
    }

    public void Fighting_mon(User user, Pokemon mon) {
        PokemonCenter nurse = new PokemonCenter();
        new Pokemon();
        Scanner sc = new Scanner(System.in);
        mon.stat();
        BGM bgm = new BGM();
        String mp3bgm = "전투bgm.mp3";
        bgm.BGM(mp3bgm);
        bgm.start();
        System.out.println("포켓몬을 선택하세요.");
        Pokemon my_1 = user.choice();

        do {
            System.out.println("무엇울 하시겠습니까?");
            System.out.println("1.싸운다.");
            System.out.println("2.잡는다.");
            System.out.println("3.포켓몬변경.");
            System.out.println("4.도망간다.");

            int choice_1;
            for(choice_1 = sc.nextInt(); choice_1 < 1 || choice_1 > 4; choice_1 = sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            switch (choice_1) {
                case 1:
                    Fighting_tr fighting_tr = new Fighting_tr();
                    fighting_tr.Fighting_tr(my_1, mon);
                    if (!my_1.life) {
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
                            mon.dock_de = false;
                            mon = null;
                            my_1 = null;
                            break;
                        }

                        System.out.println(my_1.name + "가 기절하였습니다.");
                        System.out.println("포켓몬을 선택하세요.");
                        my_1 = null;
                        my_1 = user.choice();
                        System.out.println(my_1.name + "으로 변경!!");
                    }

                    if (!mon.life) {
                        System.out.println(mon.name + "전투불가\n승리 하였습니다.");
                        mon.dock_de = false;
                        mon = null;
                        my_1 = null;
                    }
                    break;
                case 2:
                    Catch cat = new Catch();
                    boolean catok = false;
                    System.out.println("몬스터볼을 선택하세요");
                    System.out.println("1.몬스터볼 \n2.하이퍼볼");
                    int choice_2 = sc.nextInt();
                    switch (choice_2) {
                        case 1:
                            catok = cat.Catch(user, mon, user.ball);
                            break;
                        case 2:
                            catok = cat.Catch(user, mon, user.hyperBall);
                    }

                    if (catok) {
                        mon = null;
                        my_1 = null;
                    }
                    break;
                case 3:
                    System.out.println("포켓몬을 선택하세요.");
                    my_1 = null;
                    my_1 = user.choice();
                    System.out.println(my_1.name + "으로 변경!!");
                    break;
                case 4:
                    mon.dock_de = false;
                    mon = null;
            }
        } while(mon != null);

        bgm.stop = false;
        bgm.stop = false;
    }
}
