package npc;

import monster.Fight;
import monster.Normal;
import monster.Water;

public class Training_Valley_Npc extends People {
    int ran = 0;
    Normal normal = new Normal();
    Water water = new Water();
    Fight fight = new Fight();

    public Training_Valley_Npc() {
    }

    public void Training_Valley_Npc() {
        this.money_give = 1000;
        super.name = "퉁퉁이";
        this.ran = 10 + (int)(Math.random() * 5.0);
        this.water.Water(this.ran);
        this.ran = 10 + (int)(Math.random() * 5.0);
        this.normal.Normal(this.ran);
        this.ran = 10 + (int)(Math.random() * 5.0);
        this.fight.Fight(this.ran);
        super.po_insert(this.water);
        super.po_insert(this.normal);
        super.po_insert(this.fight);
        this.water = null;
        this.normal = null;
        this.fight = null;
        this.People();
    }
}
