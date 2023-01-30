package map;

import fighting.*;
import java.util.Random;
import java.util.Scanner;
import monster.*;
import npc.PokemonCenter;
import npc.Rock_Mount_Npc;
import npc.User;
import thread.BGM;
import userset.User_Set;

public class Rock_Mount {
    public Rock_Mount() {
    }

    public void Rock_Mount(User user) {
        Random rd = new Random();
        User_Set user_set = new User_Set();
        new PokemonCenter();
        String map_name = "현재위치: 바위산";
        Scanner sc = new Scanner(System.in);

        while(true) {
            String mp3bgm = "사냥터.mp3";
            BGM bgm = new BGM();
            bgm.BGM(mp3bgm);
            bgm.start();
            System.out.println(map_name);
            System.out.println("무엇을 하시겠습니까?");
            System.out.println("1.포켓몬사냥   2.트레이너대결   3.설정    4.Map이동");

            int choice;
            for(choice = sc.nextInt(); choice < 1 || choice > 6; choice = sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            switch (choice) {
                case 1:
                    bgm.stop = false;
                    System.out.println("!!!!!!!!!!몬스터 출연!!!!!!!!!");
                    Rock rock = new Rock();
                    Fight fight = new Fight();
                    Normal normal = new Normal();
                    Fighting_mon fighting_mon = new Fighting_mon();
                    Pokemon mon = new Pokemon();
                    switch (rd.nextInt(3)) {
                        case 0:
                            rock.Rock(15 + rd.nextInt(5));
                            mon = rock;
                            break;
                        case 1:
                            fight.Fight(15 + rd.nextInt(5));
                            mon = fight;
                            break;
                        case 2:
                            normal.Normal(15 + rd.nextInt(5));
                            mon = normal;
                    }

                    fighting_mon.Fighting_mon(user, (Pokemon)mon);
                    break;
                case 2:
                    bgm.stop = false;
                    System.out.println("트래이너와 전투를 시작합니다.");
                    Rock_Mount_Npc you = new Rock_Mount_Npc();
                    Fighting_Trainer fighting_trainer = new Fighting_Trainer();
                    you.Rock_Mount_Npc();
                    fighting_trainer.Fighting_trainer(user, you);
                    break;
                case 3:
                    user_set.User_Set(user);
            }

            if (choice == 4) {
                System.out.println("어디로 가시겠습니까?");
                System.out.println("1.회색씨티     2.사천왕의 성     3.나가기   4.게임종료");

                int choice_1;
                for(choice_1 = sc.nextInt(); choice_1 < 1 || choice_1 > 4; choice_1 = sc.nextInt()) {
                    System.out.println("잘못입력하였습니다. 다시입력하세요.");
                }

                if (choice_1 == 1) {
                    bgm.stop = false;
                    System.out.println("회색씨티 이동");
                    user.map_move = 6;
                    break;
                }

                if (choice_1 == 2) {
                    bgm.stop = false;
                    if (user.gray_badge.badge_have && user.blue_badge.badge_have && user.red_badge.badge_have && user.green_badge.badge_have) {
                        System.out.println("사천왕의성 이동");
                        user.map_move = 13;
                        break;
                    }

                    System.out.println("뱃지가 부족하여 입장이 불가능합니다.");
                } else if (choice_1 == 4) {
                    bgm.stop = false;
                    System.out.println("게임종료");
                    user.map_move = 99;
                    break;
                }
            }

            bgm.stop = false;
        }

    }
}
