//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import badge.Gray_badge;
import monster.Fight;
import monster.Normal;
import monster.Rock;

public class Gray_City_Boss extends Rock_Mount_Npc {
    int ran = 0;
    Gray_badge gray_badge = new Gray_badge();
    Rock rock = new Rock();
    Fight fight = new Fight();
    Normal normal = new Normal();

    public Gray_City_Boss() {
    }

    public void Gray_City_Boss() {
        super.money_give = 2000;
        super.name = "웅";
        this.gray_badge.Gray_badge();
        this.ran = 25;
        this.rock.Rock(this.ran);
        this.fight.Fight(this.ran);
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
