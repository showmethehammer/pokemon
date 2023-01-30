//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package map;

import badge.Green_badge;
import fighting.*;
import java.util.Scanner;
import market.Market;
import npc.PokemonCenter;
import npc.Sanglock_City_Boss;
import npc.User;
import thread.BGM;
import userset.User_Set;

public class Sanglock_City {
    public Sanglock_City() {
    }

    public void Sanglock_City(User user) {
        Market market = new Market();
        PokemonCenter nurse = new PokemonCenter();
        User_Set user_set = new User_Set();
        Fighting_Boss fighting_boss = new Fighting_Boss();
        Green_badge green_badge = new Green_badge();
        green_badge.Green_badge();
        String map_name = "현재위치: 상록시티";
        Scanner sc = new Scanner(System.in);

        while(true) {
            String mp3bgm = "마을bgm.mp3";
            BGM bgm = new BGM();
            bgm.BGM(mp3bgm);
            bgm.start();
            System.out.println(map_name);
            System.out.println("무엇을 하시겠습니까?");
            System.out.println("1.포켓몬센터    2.상점     3.체육관   4.설정   5.Map이동");

            int choice;
            for(choice = sc.nextInt(); choice < 1 || choice > 5; choice = sc.nextInt()) {
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
                    bgm.stop = false;
                    System.out.println("상록체육관 관장과 전투를 시작합니다.");
                    Sanglock_City_Boss you = new Sanglock_City_Boss();
                    you.Sanglock_City_Boss();
                    fighting_boss.Fighting_Boss(user, you, green_badge);
                    break;
                case 4:
                    user_set.User_Set(user);
            }

            if (choice == 5) {
                System.out.println("어디로 가시겠습니까?");
                System.out.println("1.상록초원     2.태화강     3.나가기   4.게임종료");

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
                    System.out.println("태화강 이동");
                    user.map_move = 5;
                    break;
                }

                if (choice_1 == 99) {
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
