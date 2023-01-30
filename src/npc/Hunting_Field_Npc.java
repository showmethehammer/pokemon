//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import monster.Esper;
import monster.Normal;

public class Hunting_Field_Npc extends People {
    int ran = 0;
    Normal normal = new Normal();
    Esper esper_1 = new Esper();
    Esper esper_2 = new Esper();

    public Hunting_Field_Npc() {
    }

    public void Hunting_Field_Npc() {
        super.money_give = 1000;
        super.name = "나강해";
        this.ran = 1 + (int)(Math.random() * 8.0);
        this.normal.Normal(this.ran);
        this.ran = 1 + (int)(Math.random() * 8.0);
        this.esper_1.Esper(this.ran);
        this.ran = 1 + (int)(Math.random() * 8.0);
        this.esper_2.Esper(this.ran);
        super.po_insert(this.normal);
        super.po_insert(this.esper_1);
        super.po_insert(this.esper_2);
        this.normal = null;
        this.esper_1 = null;
        this.esper_2 = null;
        this.People();
    }
}
