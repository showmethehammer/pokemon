//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package market;

import java.util.Scanner;
import npc.User;

public class Market {
    public Market() {
    }

    public void Market(User user) {
        Scanner sc = new Scanner(System.in);
        int choice_1;
        do {
            System.out.println("무엇울 구매하시겠습니까?");
            System.out.println("1." + user.ball.poketball + ": 200");
            System.out.println("2." + user.hyperBall.poketball + ": 400");
            System.out.println("3." + user.heal_hi.heal_name + ": 200");
            System.out.println("4." + user.heal_mi.heal_name + ": 100");
            System.out.println("5." + user.mp_hi.mp_name + ": 200");
            System.out.println("6." + user.mp_mi.mp_name + ": 100");
            System.out.println("7." + user.dock_clear.name + ": 100");
            System.out.println("8.나가기");

            for(choice_1 = sc.nextInt(); choice_1 < 1 || choice_1 > 8; choice_1 = sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            switch (choice_1) {
                case 1:
                    System.out.println("구매 개수를 입력하세요.");
                    user.ball_in(sc.nextInt(), 200);
                    break;
                case 2:
                    System.out.println("구매 개수를 입력하세요.");
                    user.hyperball_in(sc.nextInt(), 400);
                    break;
                case 3:
                    System.out.println("구매 개수를 입력하세요.");
                    user.heal_hi_in(sc.nextInt(), 200);
                    break;
                case 4:
                    System.out.println("구매 개수를 입력하세요.");
                    user.heal_mi_in(sc.nextInt(), 100);
                    break;
                case 5:
                    System.out.println("구매 개수를 입력하세요.");
                    user.mp_hi_in(sc.nextInt(), 100);
                    break;
                case 6:
                    System.out.println("구매 개수를 입력하세요.");
                    user.mp_mi_in(sc.nextInt(), 100);
                    break;
                case 7:
                    System.out.println("구매 개수를 입력하세요.");
                    user.dock_clear_in(sc.nextInt(), 100);
                case 8:
            }
        } while(choice_1 != 8);

    }
}
