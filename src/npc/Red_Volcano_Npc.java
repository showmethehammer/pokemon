//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import monster.Electricity;
import monster.Fire;
import monster.Normal;

public class Red_Volcano_Npc extends People {
    int ran = 0;
    Fire fire = new Fire();
    Electricity electricity = new Electricity();
    Normal normal = new Normal();

    public Red_Volcano_Npc() {
    }

    public void Red_Volcano_Npc() {
        super.money_give = 1000;
        super.name = "산할아버지";
        this.ran = 25 + (int)(Math.random() * 10.0);
        this.fire.Fire(this.ran);
        this.ran = 25 + (int)(Math.random() * 10.0);
        this.electricity.Electricity(this.ran);
        this.ran = 25 + (int)(Math.random() * 10.0);
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
