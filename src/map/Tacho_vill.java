//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package map;

import java.util.Scanner;
import market.Market;
import npc.PokemonCenter;
import npc.User;
import thread.BGM;
import userset.User_Set;

public class Tacho_vill {
    public Tacho_vill() {
    }

    public void Tacho_vill(User user) {
        Market market = new Market();
        User_Set user_set = new User_Set();
        PokemonCenter nurse = new PokemonCenter();
        String map_name = "현재위치: 태초마을";
        Scanner sc = new Scanner(System.in);

        while(true) {
            String mp3bgm = "마을bgm.mp3";
            BGM bgm = new BGM();
            bgm.BGM(mp3bgm);
            bgm.start();
            System.out.println(map_name);
            System.out.println("무엇을 하시겠습니까?");
            System.out.println("1.포켓몬센터    2.상점    3.설정   4.Map이동");

            int choice;
            for(choice = sc.nextInt(); choice < 1 || choice > 6; choice = sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            switch (choice) {
                case 1:
                    bgm.stop = false;
                    nurse.PokemonCenter(user.mypet);
                    user.People();
                    break;
                case 2:
                    market.Market(user);
                    break;
                case 3:
                    user_set.User_Set(user);
            }

            if (choice == 4) {
                System.out.println("어디로 가시겠습니까?");
                System.out.println("1.상록초원     2.회색초원     3.나가기   4.게임종료");

                int choice_1;
                for(choice_1 = sc.nextInt(); choice_1 < 1 || choice_1 > 4; choice_1 = sc.nextInt()) {
                    System.out.println("잘못입력하였습니다. 다시입력하세요.");
                }

                if (choice_1 == 1) {
                    bgm.stop = false;
                    System.out.println("상록초원 이동");
                    user.map_move = 2;
                    break;
                }

                if (choice_1 == 2) {
                    bgm.stop = false;
                    System.out.println("회색초원 이동");
                    user.map_move = 4;
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
