//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import monster.Bug;
import monster.Flight;
import monster.Grass;

public class FureKing_Ilmock extends People {
    int ran = 0;
    Grass grass = new Grass();
    Bug bug = new Bug();
    Flight flight = new Flight();
    Grass grass_1 = new Grass();
    Bug bug_1 = new Bug();
    Flight flight_1 = new Flight();
    boolean life = true;

    public FureKing_Ilmock() {
    }

    public void FureKing_Ilmock() {
        this.life = true;
        super.money_give = 1000;
        super.name = "일목";
        this.ran = 40;
        this.grass.Grass(this.ran);
        this.bug.Bug(this.ran);
        this.flight.Flight(this.ran);
        this.grass_1.Grass(this.ran);
        this.bug_1.Bug(this.ran);
        this.flight_1.Flight(this.ran);
        super.po_insert(this.grass);
        super.po_insert(this.bug);
        super.po_insert(this.flight);
        super.po_insert(this.grass_1);
        super.po_insert(this.bug_1);
        super.po_insert(this.flight_1);
        this.grass = null;
        this.bug = null;
        this.flight = null;
        this.grass_1 = null;
        this.bug_1 = null;
        this.flight_1 = null;
        this.People();
    }
}
