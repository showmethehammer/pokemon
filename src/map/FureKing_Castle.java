//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package map;

import java.util.Random;
import java.util.Scanner;

import fighting.Fighting_Trainer;
import npc.FureKing_Docksoo;
import npc.FureKing_Ilmock;
import npc.FureKing_Mockho;
import npc.FureKing_Sb;
import npc.PokemonCenter;
import npc.User;
import thread.BGM;
import userset.User_Set;

public class FureKing_Castle {
    public FureKing_Castle() {
    }

    public void FureKing_Castle(User user) {
        new Random();
        User_Set user_set = new User_Set();
        String[] fureking_Name = new String[4];
        int fureking_cts = 0;
        fureking_Name[0] = "독수";
        fureking_Name[1] = "일목";
        fureking_Name[2] = "목호";
        fureking_Name[3] = "시바";
        new PokemonCenter();
        String map_name = "현재위치: 사천왕의 성";
        Scanner sc = new Scanner(System.in);

        while(true) {
            String mp3bgm = "시작bgm.mp3";
            BGM bgm = new BGM();
            bgm.BGM(mp3bgm);
            bgm.start();
            System.out.println(map_name);
            System.out.println("무엇을 하시겠습니까?");
            System.out.println("1. " + fureking_Name[fureking_cts] + "   2.설정    3.Map이동");

            int choice;
            for(choice = sc.nextInt(); choice < 1 || choice > 6; choice = sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            switch (choice) {
                case 1:
                    bgm.stop = false;
                    boolean result = false;
                    System.out.println("사천왕과의 전투를 시작합니다.");
                    Fighting_Trainer fighting_trainer = new Fighting_Trainer();
                    BGM bgm_1 = new BGM();
                    String mp3bgm_1 = "트레이너전투bgm.mp3";
                    bgm_1.BGM(mp3bgm_1);
                    bgm_1.start();
                    if (fureking_cts == 0) {
                        FureKing_Docksoo you_1 = new FureKing_Docksoo();
                        you_1.FureKing_Docksoo();
                        result = fighting_trainer.Fighting_trainer_1(user, you_1);
                    } else if (fureking_cts == 1) {
                        FureKing_Ilmock you_2 = new FureKing_Ilmock();
                        you_2.FureKing_Ilmock();
                        result = fighting_trainer.Fighting_trainer_1(user, you_2);
                    } else if (fureking_cts == 2) {
                        FureKing_Mockho you_3 = new FureKing_Mockho();
                        you_3.FureKing_Mockho();
                        result = fighting_trainer.Fighting_trainer_1(user, you_3);
                    } else if (fureking_cts == 3) {
                        FureKing_Sb you_4 = new FureKing_Sb();
                        you_4.FureKing_Sb();
                        result = fighting_trainer.Fighting_trainer_1(user, you_4);
                    }

                    bgm_1.stop = false;
                    bgm_1 = null;
                    if (result && fureking_cts < 3) {
                        ++fureking_cts;
                    } else {
                        if (result && fureking_cts == 3) {
                            System.out.println("사천왕을 모두 이겼습니다.");
                            System.out.println("뮤의성 으로 가실수 있습니다.");
                            user.mu = true;
                            fureking_cts = 0;
                            break;
                        }

                        fureking_cts = 0;
                    }
                    break;
                case 2:
                    user_set.User_Set(user);
            }

            if (choice == 3) {
                System.out.println("어디로 가시겠습니까?");
                System.out.println("1.사냥터     2.바위산     3.나가기   4.게임종료");

                int choice_1;
                for(choice_1 = sc.nextInt(); choice_1 < 1 || choice_1 > 4; choice_1 = sc.nextInt()) {
                    System.out.println("잘못입력하였습니다. 다시입력하세요.");
                }

                if (choice_1 == 1) {
                    bgm.stop = false;
                    System.out.println("사냥터 이동");
                    user.map_move = 11;
                    break;
                }

                if (choice_1 == 2) {
                    bgm.stop = false;
                    System.out.println("바위산 이동");
                    user.map_move = 12;
                    break;
                }

                if (choice_1 == 4) {
                    bgm.stop = false;
                    System.out.println("게임종료");
                    user.map_move = 99;
                    break;
                }
            }

            bgm.stop = false;
            bgm = null;
        }

    }
}
