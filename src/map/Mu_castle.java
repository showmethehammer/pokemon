//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package map;

import fighting.*;
import java.util.Random;
import java.util.Scanner;
import monster.Mu;
import monster.Pokemon;
import npc.PokemonCenter;
import npc.User;
import thread.BGM;
import userset.User_Set;

public class Mu_castle {
    public Mu_castle() {
    }

    public void Mu_castle(User user) {
        new Random();
        User_Set user_set = new User_Set();
        new PokemonCenter();
        String map_name = "현재위치: 뮤의 성";
        Scanner sc = new Scanner(System.in);

        while(true) {
            String mp3bgm = "사냥터.mp3";
            BGM bgm = new BGM();
            bgm.BGM(mp3bgm);
            bgm.start();
            System.out.println(map_name);
            System.out.println("무엇을 하시겠습니까?");
            System.out.println("1.뮤와 대경결   2.설정    3.Map이동");

            int choice;
            for(choice = sc.nextInt(); choice < 1 || choice > 3; choice = sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            switch (choice) {
                case 1:
                    bgm.stop = false;
                    System.out.println("!!!!!!!!!!몬스터 출연!!!!!!!!!");
                    Mu mu = new Mu();
                    Fighting_mon fighting_mon = new Fighting_mon();
                    new Pokemon();
                    mu.Mu(50);
                    fighting_mon.Fighting_mon(user, mu);
                    break;
                case 2:
                    user_set.User_Set(user);
            }

            if (choice == 3) {
                System.out.println("어디로 가시겠습니까?");
                System.out.println("1.사냥터     2.나가기     3.게임종료");

                int choice_1;
                for(choice_1 = sc.nextInt(); choice_1 < 1 || choice_1 > 3; choice_1 = sc.nextInt()) {
                    System.out.println("잘못입력하였습니다. 다시입력하세요.");
                }

                if (choice_1 == 1) {
                    bgm.stop = false;
                    System.out.println("사냥터 이동");
                    user.map_move = 11;
                    break;
                }

                if (choice_1 == 3) {
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
