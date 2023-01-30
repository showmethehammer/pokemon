//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package map;

import fighting.*;
import java.util.Random;
import java.util.Scanner;
import monster.Esper;
import monster.Normal;
import monster.Pokemon;
import npc.Hunting_Field_Npc;
import npc.PokemonCenter;
import npc.User;
import thread.BGM;
import userset.User_Set;

public class Hunting_Field {
    public Hunting_Field() {
    }

    public void Hunting_Field(User user) {
        Random rd = new Random();
        new PokemonCenter();
        User_Set user_set = new User_Set();
        String map_name = "현재위치: 사냥터";
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
            for(choice = sc.nextInt(); choice < 1 || choice > 4; choice = sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            switch (choice) {
                case 1:
                    bgm.stop = false;
                    System.out.println("!!!!!!!!!!몬스터 출연!!!!!!!!!");
                    Esper esper = new Esper();
                    Normal normal = new Normal();
                    Pokemon mon = new Pokemon();
                    Fighting_mon fighting_mon = new Fighting_mon();
                    switch (rd.nextInt(2)) {
                        case 0:
                            esper.Esper(35 + rd.nextInt(5));
                            mon = esper;
                            break;
                        case 1:
                            normal.Normal(35 + rd.nextInt(5));
                            mon = normal;
                    }

                    fighting_mon.Fighting_mon(user, (Pokemon)mon);
                    break;
                case 2:
                    bgm.stop = false;
                    System.out.println("트래이너와 전투를 시작합니다.");
                    Hunting_Field_Npc you = new Hunting_Field_Npc();
                    Fighting_Trainer fighting_trainer = new Fighting_Trainer();
                    you.Hunting_Field_Npc();
                    fighting_trainer.Fighting_trainer(user, you);
                    break;
                case 3:
                    user_set.User_Set(user);
            }

            if (choice == 4) {
                System.out.println("어디로 가시겠습니까?");
                System.out.print("1.레드씨티     2.사천왕의 성   ");

                byte choice_1_log;
                if (user.mu) {
                    choice_1_log = 5;
                    System.out.print("3.뮤의 성   4.나가기   5.게임종료");
                } else {
                    choice_1_log = 4;
                    System.out.print("3.나가기   4.게임종료");
                }

                System.out.println();

                int choice_1;
                for(choice_1 = sc.nextInt(); choice_1 < 1 || choice_1 > choice_1_log; choice_1 = sc.nextInt()) {
                    System.out.println("잘못입력하였습니다. 다시입력하세요.");
                }

                if (choice_1 == 1) {
                    bgm.stop = false;
                    System.out.println("레드씨티 이동");
                    user.map_move = 10;
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
                } else {
                    if (choice_1 == choice_1_log - 2 && user.mu) {
                        bgm.stop = false;
                        System.out.println("뮤의 성 이동");
                        user.map_move = 14;
                        break;
                    }

                    if (choice_1 == choice_1_log) {
                        bgm.stop = false;
                        System.out.println("게임종료");
                        user.map_move = 99;
                        break;
                    }
                }
            }

            bgm.stop = false;
        }

    }
}
