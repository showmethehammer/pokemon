//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import monster.Fight;
import monster.Normal;
import monster.Rock;

public class Rock_Mount_Npc extends People {
    int ran = 0;
    Rock rock = new Rock();
    Fight fight = new Fight();
    Normal normal = new Normal();

    public Rock_Mount_Npc() {
    }

    public void Rock_Mount_Npc() {
        super.money_give = 1000;
        super.name = "산할아버지";
        this.ran = 15 + (int)(Math.random() * 5.0);
        this.rock.Rock(this.ran);
        this.ran = 15 + (int)(Math.random() * 5.0);
        this.fight.Fight(this.ran);
        this.ran = 15 + (int)(Math.random() * 5.0);
        this.normal.Normal(this.ran);
        super.po_insert(this.rock);
        super.po_insert(this.fight);
        super.po_insert(this.normal);
        this.rock = null;
        this.fight = null;
        this.normal = null;
        this.People();
    }
}
