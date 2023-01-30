//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import monster.Pokemon;

public class People {
    public String name = "";
    public Pokemon[] mypet = new Pokemon[6];
    public int money_give = 0;

    public People() {
    }

    public void People() {
        System.out.println("--정보--");
        System.out.println("이름: " + this.name);
        System.out.println("--보유포켓몬--");

        for(int i = 0; i < this.mypet.length; ++i) {
            String mon_life = "";
            String dock_check = "";
            if (this.mypet[i] != null) {
                if (this.mypet[i].dock_de) {
                    dock_check = "   독감염: O";
                } else {
                    dock_check = "   독감염: X";
                }

                if (this.mypet[i].life) {
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

    }

    public void po_insert(Pokemon insert) {
        for(int i = 0; i < this.mypet.length; ++i) {
            if (this.mypet[i] == null) {
                this.mypet[i] = insert;
                break;
            }
        }

    }

    public Pokemon choice(int a) {
        return this.mypet[a];
    }
}
