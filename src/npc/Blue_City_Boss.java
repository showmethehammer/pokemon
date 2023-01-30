//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import badge.Blue_badge;
import monster.Esper;
import monster.Water;

public class Blue_City_Boss extends Tahoa_Npc {
    int ran = 0;
    Blue_badge blue_badge = new Blue_badge();
    Water water = new Water();
    Esper esper = new Esper();
    Esper esper_1 = new Esper();

    public Blue_City_Boss() {
    }

    public void Blue_City_Boss() {
        this.money_give = 1000;
        super.name = "이슬";
        this.blue_badge.Blue_badge();
        this.ran = 20;
        this.water.Water(this.ran);
        this.esper.Esper(this.ran);
        this.esper_1.Esper(this.ran);
        super.po_insert(this.water);
        super.po_insert(this.esper);
        super.po_insert(this.esper_1);
        this.water = null;
        this.esper = null;
        this.esper_1 = null;
        this.People();
    }
}
