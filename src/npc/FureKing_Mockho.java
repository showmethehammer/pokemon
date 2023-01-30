//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import monster.Esper;
import monster.Water;

public class FureKing_Mockho extends People {
    int ran = 0;
    Water water = new Water();
    Esper esper = new Esper();
    Water water_1 = new Water();
    Esper esper_1 = new Esper();
    Water water_2 = new Water();
    Esper esper_2 = new Esper();
    boolean life = true;

    public FureKing_Mockho() {
    }

    public void FureKing_Mockho() {
        super.money_give = 1000;
        super.name = "목호";
        this.life = true;
        this.ran = 40;
        this.water.Water(this.ran);
        this.esper.Esper(this.ran);
        this.water_1.Water(this.ran);
        this.esper_1.Esper(this.ran);
        this.water_2.Water(this.ran);
        this.esper_2.Esper(this.ran);
        super.po_insert(this.water);
        super.po_insert(this.esper);
        super.po_insert(this.water_1);
        super.po_insert(this.esper_1);
        super.po_insert(this.water_2);
        super.po_insert(this.esper_2);
        this.water = null;
        this.esper = null;
        this.water_1 = null;
        this.esper_1 = null;
        this.water_2 = null;
        this.esper_2 = null;
        this.People();
    }
}
