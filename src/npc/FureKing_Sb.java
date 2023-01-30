//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import monster.Electricity;
import monster.Fire;

public class FureKing_Sb extends People {
    int ran = 0;
    Fire fire = new Fire();
    Electricity electricity = new Electricity();
    Fire fire_1 = new Fire();
    Electricity electricity_1 = new Electricity();
    Fire fire_2 = new Fire();
    boolean life = true;
    Electricity electricity_2 = new Electricity();

    public FureKing_Sb() {
    }

    public void FureKing_Sb() {
        super.money_give = 1000;
        super.name = "시바";
        this.life = true;
        this.ran = 40;
        this.fire.Fire(this.ran);
        this.electricity.Electricity(this.ran);
        this.fire_1.Fire(this.ran);
        this.electricity_1.Electricity(this.ran);
        this.fire_2.Fire(this.ran);
        this.electricity_2.Electricity(this.ran);
        super.po_insert(this.fire);
        super.po_insert(this.electricity);
        super.po_insert(this.fire_1);
        super.po_insert(this.electricity_1);
        super.po_insert(this.fire_2);
        super.po_insert(this.electricity_2);
        this.fire = null;
        this.electricity = null;
        this.fire_1 = null;
        this.electricity_1 = null;
        this.fire_2 = null;
        this.electricity_2 = null;
        this.People();
    }
}
