
package npc;

import badge.Badge;
import badge.Blue_badge;
import badge.Gray_badge;
import badge.Green_badge;
import badge.Red_badge;
import java.util.Scanner;
import market.Dock_clear;
import market.Heal;
import market.Heal_hight;
import market.Heal_mid;
import market.HyperBall;
import market.Mp;
import market.Mp_hight;
import market.Mp_mid;
import market.PoketBall;
import monster.Pokemon;

public class User extends People {
    Scanner sc;
    public int money;
    public PoketBall ball;
    public HyperBall hyperBall;
    public Heal_hight heal_hi;
    public Heal_mid heal_mi;
    public Mp_hight mp_hi;
    public Mp_mid mp_mi;
    public Dock_clear dock_clear;
    public int map_move;
    public boolean mu;
    public Blue_badge blue_badge;
    public Green_badge green_badge;
    public Gray_badge gray_badge;
    public Red_badge red_badge;

    public User() {
        this.sc = new Scanner(System.in);
        this.money = 2000;
        this.ball = new PoketBall();
        this.hyperBall = new HyperBall();
        this.heal_hi = new Heal_hight();
        this.heal_mi = new Heal_mid();
        this.mp_hi = new Mp_hight();
        this.mp_mi = new Mp_mid();
        this.dock_clear = new Dock_clear();
        this.map_move = 0;
        this.mu = false;
        this.blue_badge = new Blue_badge();
        this.green_badge = new Green_badge();
        this.gray_badge = new Gray_badge();
        this.red_badge = new Red_badge();
    }

    public void User(String name, Pokemon mon) {
        this.blue_badge.Blue_badge();
        this.gray_badge.Gray_badge();
        this.red_badge.Red_badge();
        this.green_badge.Green_badge();
        this.hyperBall.HyperBall();
        this.dock_clear.Dock_clear();
        this.map_move = 1;
        this.heal_mi.Heal_mid();
        this.heal_hi.Heal_hight();
        this.mp_mi.Mp_mid();
        this.mp_hi.Mp_hight();

        for(int i = 0; i < super.mypet.length; ++i) {
            if (super.mypet[i] == null) {
                super.name = name;
                this.mypet[i] = mon;
                this.People();
                break;
            }
        }

    }

    public void del(int num) {
        int del_log = 0;

        int i;
        for(i = 0; i < super.mypet.length; ++i) {
            if (super.mypet[i] != null) {
                ++del_log;
            }
        }

        if (del_log <= 1) {
            System.out.println("몬스터가 1개밖에 없어서 불가능하다.");
        } else {
            super.mypet[num] = null;
        }

        for(i = 0; i < super.mypet.length; ++i) {
            if (super.mypet[i] == null) {
                for(int j = i + 1; j < super.mypet.length; ++j) {
                    if (super.mypet[j] != null) {
                        super.mypet[i] = super.mypet[j];
                        super.mypet[j] = null;
                        break;
                    }
                }
            }
        }

        this.People();
    }

    public void heal_hi_in(int pulus, int money) {
        if (pulus * money <= this.money) {
            Heal_hight var10000 = this.heal_hi;
            var10000.ea += pulus;
            this.money -= money * pulus;
            System.out.println(this.heal_hi.heal_name + "를 " + pulus + "개 구매하였습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public void heal_mi_in(int pulus, int money) {
        if (pulus * money <= this.money) {
            Heal_mid var10000 = this.heal_mi;
            var10000.ea += pulus;
            this.money -= money * pulus;
            System.out.println(this.heal_mi.heal_name + "를 " + pulus + "개 구매하였습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public void mp_hi_in(int pulus, int money) {
        if (pulus * money <= this.money) {
            Mp_hight var10000 = this.mp_hi;
            var10000.ea += pulus;
            this.money -= money * pulus;
            System.out.println(this.mp_hi.mp_name + "를 " + pulus + "개 구매하였습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public void mp_mi_in(int pulus, int money) {
        if (pulus * money <= this.money) {
            Mp_mid var10000 = this.mp_mi;
            var10000.ea += pulus;
            this.money -= money * pulus;
            System.out.println(this.mp_mi.mp_name + "를 " + pulus + "개 구매하였습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public void ball_in(int pulus, int money) {
        if (pulus * money <= this.money) {
            PoketBall var10000 = this.ball;
            var10000.ea += pulus;
            this.money -= money * pulus;
            System.out.println(this.ball.poketball + "를 " + pulus + "개 구매하였습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public void hyperball_in(int pulus, int money) {
        if (pulus * money <= this.money) {
            HyperBall var10000 = this.hyperBall;
            var10000.ea += pulus;
            this.money -= money * pulus;
            System.out.println(this.hyperBall.poketball + "를 " + pulus + "개 구매하였습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public void dock_clear_in(int pulus, int money) {
        if (pulus * money <= this.money) {
            Dock_clear var10000 = this.dock_clear;
            var10000.ea += pulus;
            this.money -= money * pulus;
            System.out.println(this.dock_clear.name + "를 " + pulus + "개 구매하였습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public void mony_in(int money_in) {
        this.money += money_in;
    }

    public void People() {
        super.People();
        System.out.println("현재 자산: " + this.money);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("---------------------------------가방------------------------------------");
        if (this.heal_hi.ea > 0) {
            System.out.println(this.heal_hi.heal_name + ": " + this.heal_hi.ea);
        }

        if (this.heal_mi.ea > 0) {
            System.out.println(this.heal_mi.heal_name + ": " + this.heal_mi.ea);
        }

        if (this.mp_hi.ea > 0) {
            System.out.println(this.mp_hi.mp_name + ": " + this.mp_hi.ea);
        }

        if (this.mp_mi.ea > 0) {
            System.out.println(this.mp_mi.mp_name + ": " + this.mp_mi.ea);
        }

        if (this.ball.ea > 0) {
            System.out.println(this.ball.poketball + ": " + this.ball.ea);
        }

        if (this.hyperBall.ea > 0) {
            System.out.println(this.hyperBall.poketball + ": " + this.hyperBall.ea);
        }

        if (this.dock_clear.ea > 0) {
            System.out.println(this.dock_clear.name + ": " + this.dock_clear.ea);
        }

        if (this.ball.ea + this.heal_mi.ea + this.heal_hi.ea == 0) {
            System.out.println("------------------------------아이템 없음---------------------------------");
        }

        System.out.println();
        System.out.println("-------------------------------배찌 List----------------------------------");
        System.out.print(this.blue_badge.badge_name + ": ");
        if (this.blue_badge.badge_have) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }

        System.out.print(this.green_badge.badge_name + ": ");
        if (this.green_badge.badge_have) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }

        System.out.print(this.red_badge.badge_name + ": ");
        if (this.red_badge.badge_have) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }

        System.out.print(this.gray_badge.badge_name + ": ");
        if (this.gray_badge.badge_have) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }

        System.out.println("------------------------------------------------------------------------");
    }

    public Pokemon choice() {
        int cts = 0;

        while(true) {
            System.out.println("몬스터 선택");

            for(int i = 0; i < super.mypet.length; ++i) {
                String mon_life = "";
                String dock_check = "";
                if (this.mypet[i] != null) {
                    ++cts;
                    if (this.mypet[i].dock_de) {
                        dock_check = "   독감염: O";
                    } else {
                        dock_check = "   독감염: X";
                    }

                    if (super.mypet[i].life) {
                        mon_life = "전투가능";
                    } else {
                        mon_life = "전투불가";
                    }

                    System.out.println(i + 1 + ".이름: " + this.mypet[i].name + "   타입: " + this.mypet[i].type_name + "   상태: " + mon_life + dock_check + "\n   LV: " + this.mypet[i].level + "   HP: " + this.mypet[i].hp_cts + "/" + this.mypet[i].hp + "   MP: " + this.mypet[i].mp_cts + "/" + this.mypet[i].mp + "   exe: " + this.mypet[i].exe_cts + "/" + this.mypet[i].exe);
                    System.out.println("------------------------------------------------------------------------");
                } else {
                    System.out.println(i + 1 + ".없음");
                    System.out.println("------------------------------------------------------------------------");
                }
            }

            int choice_1;
            for(choice_1 = this.sc.nextInt(); choice_1 < 1 || choice_1 > cts; choice_1 = this.sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            if (this.mypet[choice_1 - 1].life) {
                return super.mypet[choice_1 - 1];
            }

            System.out.println("전투가 불가능한 상태입니다.");
        }
    }

    public void hp_reco(Heal a, int choice) {
        Pokemon var10000;
        String var10001;
        if (a.heal_name == this.heal_hi.heal_name) {
            if (this.heal_hi.ea > 0) {
                --this.heal_hi.ea;
                var10000 = this.mypet[choice - 1];
                var10000.hp_cts += this.heal_hi.hp_up;
                if (this.mypet[choice - 1].hp_cts > this.mypet[choice - 1].hp) {
                    this.mypet[choice - 1].hp_cts = this.mypet[choice - 1].hp;
                }

                var10001 = this.mypet[choice - 1].name;
                System.out.println(var10001 + "의 HP " + this.heal_hi.hp_up + "충전\n 현재 HP: " + this.mypet[choice - 1].hp_cts + "/" + this.mypet[choice - 1].hp);
            } else {
                System.out.println(a.heal_name + "이 없습니다.");
            }
        }

        if (a.heal_name == this.heal_mi.heal_name) {
            if (this.heal_mi.ea > 0) {
                --this.heal_mi.ea;
                var10000 = this.mypet[choice - 1];
                var10000.hp_cts += this.heal_mi.hp_up;
                if (this.mypet[choice - 1].hp_cts > this.mypet[choice - 1].hp) {
                    this.mypet[choice - 1].hp_cts = this.mypet[choice - 1].hp;
                }

                var10001 = this.mypet[choice - 1].name;
                System.out.println(var10001 + "의 HP " + this.heal_mi.hp_up + "충전\n 현재 HP: " + this.mypet[choice - 1].hp_cts + "/" + this.mypet[choice - 1].hp);
            } else {
                System.out.println(a.heal_name + "이 없습니다.");
            }
        }

    }

    public void mp_reco(Mp a, int choice) {
        Pokemon var10000;
        String var10001;
        if (a.mp_name == this.mp_hi.mp_name) {
            if (this.mp_hi.ea > 0) {
                --this.mp_hi.ea;
                var10000 = this.mypet[choice - 1];
                var10000.mp_cts += this.mp_hi.mp_up;
                if (this.mypet[choice - 1].mp_cts > this.mypet[choice - 1].mp) {
                    this.mypet[choice - 1].mp_cts = this.mypet[choice - 1].mp;
                }

                var10001 = this.mypet[choice - 1].name;
                System.out.println(var10001 + "의 MP " + this.mp_hi.mp_up + "충전\n 현재 MP: " + this.mypet[choice - 1].mp_cts + "/" + this.mypet[choice - 1].mp);
            } else {
                System.out.println(a.mp_name + "이 없습니다.");
            }
        }

        if (a.mp_name == this.mp_mi.mp_name) {
            if (this.mp_mi.ea > 0) {
                --this.mp_mi.ea;
                var10000 = this.mypet[choice - 1];
                var10000.mp_cts += this.mp_mi.mp_up;
                if (this.mypet[choice - 1].mp_cts > this.mypet[choice - 1].mp) {
                    this.mypet[choice - 1].mp_cts = this.mypet[choice - 1].mp;
                }

                var10001 = this.mypet[choice - 1].name;
                System.out.println(var10001 + "의 MP " + this.mp_mi.mp_up + "충전\n 현재 MP: " + this.mypet[choice - 1].mp_cts + "/" + this.mypet[choice - 1].mp);
            } else {
                System.out.println(a.mp_name + "이 없습니다.");
            }
        }

    }

    public void dock_clear_exe(Dock_clear dock_clear, int choice) {
        if (dock_clear.ea > 0) {
            --dock_clear.ea;
            this.mypet[choice - 1].dock_de = false;
            System.out.println("해독하였습니다.");
        } else {
            System.out.println(dock_clear.name + "이(가) 없습니다.");
        }

    }

    public void badgehave(Badge badge) {
        if (this.blue_badge.badge_name.equals(badge.badge_name)) {
            this.blue_badge.badge_have = true;
        }

        if (this.green_badge.badge_name.equals(badge.badge_name)) {
            this.green_badge.badge_have = true;
        }

        if (this.gray_badge.badge_name.equals(badge.badge_name)) {
            this.gray_badge.badge_have = true;
        }

        if (this.red_badge.badge_name.equals(badge.badge_name)) {
            this.red_badge.badge_have = true;
        }

    }
}
