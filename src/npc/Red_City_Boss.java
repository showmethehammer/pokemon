//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import badge.Red_badge;
import monster.Electricity;
import monster.Fire;
import monster.Normal;

public class Red_City_Boss extends Red_Volcano_Npc {
    int ran = 0;
    Red_badge red_badge = new Red_badge();
    Fire fire = new Fire();
    Electricity electricity = new Electricity();
    Normal normal = new Normal();

    public Red_City_Boss() {
    }

    public void Red_City_Boss() {
        super.money_give = 3000;
        super.name = "초련";
        this.red_badge.Red_badge();
        this.ran = 30;
        this.fire.Fire(this.ran);
        this.electricity.Electricity(this.ran);
        this.normal.Normal(this.ran);
        super.po_insert(this.fire);
        super.po_insert(this.electricity);
        super.po_insert(this.normal);
        this.fire = null;
        this.electricity = null;
        this.normal = null;
        this.People();
    }
}
