//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import monster.Fight;
import monster.Rock;

public class FureKing_Docksoo extends People {
    int ran = 0;
    Rock rock = new Rock();
    Fight fight = new Fight();
    Rock rock_1 = new Rock();
    Fight fight_1 = new Fight();
    Rock rock_2 = new Rock();
    Fight fight_2 = new Fight();
    boolean life = true;

    public FureKing_Docksoo() {
    }

    public void FureKing_Docksoo() {
        this.life = true;
        super.money_give = 1000;
        super.name = "독수";
        this.ran = 40;
        this.rock.Rock(this.ran);
        this.fight.Fight(this.ran);
        this.rock_1.Rock(this.ran);
        this.fight_1.Fight(this.ran);
        this.rock_2.Rock(this.ran);
        this.fight_2.Fight(this.ran);
        super.po_insert(this.rock);
        super.po_insert(this.fight);
        super.po_insert(this.rock_1);
        super.po_insert(this.fight_1);
        super.po_insert(this.rock_2);
        super.po_insert(this.fight_2);
        this.rock = null;
        this.fight = null;
        this.rock_1 = null;
        this.fight_1 = null;
        this.rock_2 = null;
        this.fight_2 = null;
        this.People();
    }
}
