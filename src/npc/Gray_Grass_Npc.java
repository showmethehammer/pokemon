//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import monster.Bug;
import monster.Flight;
import monster.Grass;

public class Gray_Grass_Npc extends People {
    int ran = 0;
    Grass grass = new Grass();
    Bug bug = new Bug();
    Flight flight = new Flight();

    public Gray_Grass_Npc() {
    }

    public void Gray_Grass_Npc() {
        super.money_give = 1000;
        super.name = "영민";
        this.ran = 1 + (int)(Math.random() * 8.0);
        this.grass.Grass(this.ran);
        this.ran = 1 + (int)(Math.random() * 8.0);
        this.bug.Bug(this.ran);
        this.ran = 1 + (int)(Math.random() * 8.0);
        this.flight.Flight(this.ran);
        super.po_insert(this.grass);
        super.po_insert(this.bug);
        super.po_insert(this.flight);
        this.grass = null;
        this.bug = null;
        this.flight = null;
        this.People();
    }
}
