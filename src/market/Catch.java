package market;

import java.util.Scanner;
import monster.Pokemon;
import npc.User;

public class Catch {
    public boolean catch_ok = true;
    public int time_cts = 0;
    public int time_limit = 50;

    public Catch() {
    }

    public boolean Catch(User my, Pokemon you, PoketBall ball) {
        int ct = 0;
        this.time_cts = 0;
        this.catch_ok = true;
        this.time_limit = 100 / (you.hp_cts / 20 + 1) * ball.percentage;
        String typing = you.name + " 넌 내꺼야.";
        String typing_1 = "";
        Scanner sc = new Scanner(System.in);
        if (ball.ea > 0) {
            --ball.ea;

            for(int i = 0; i < my.mypet.length; ++i) {
                if (my.mypet[i] == null) {
                    ++ct;
                }
            }

            if (ct == 0) {
                System.out.println("몬스터가 가득찼습니다.");
                return false;
            } else {
                System.out.println("-아래글자를 타이핑하세요.-");
                Thread time = new Thread();
                time.start();
                System.out.println(typing);
                typing_1 = sc.nextLine();
                this.catch_ok = false;
                if (typing.equals(typing_1)) {
                    System.out.println(you.name + "잡는것을 성공하였습니다.");
                    my.po_insert(you);
                    return true;
                } else {
                    System.out.println(you.name + "잡는것을 실패하였습니다.");
                    return false;
                }
            }
        } else {
            System.out.println("몬스터볼이 없습니다.");
            return false;
        }
    }
}
