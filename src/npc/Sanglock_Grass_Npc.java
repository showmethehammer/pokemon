
package npc;

import monster.Bug;
import monster.Flight;
import monster.Grass;

public class Sanglock_Grass_Npc extends People {
    int ran = 0;
    Grass grass = new Grass();
    Bug bug = new Bug();
    Flight flight = new Flight();

    public Sanglock_Grass_Npc() {
    }

    public void Sanglock_Grass_Npc() {
        super.money_give = 1000;
        super.name = "진구";
        this.ran = 10;
        this.grass.Grass(this.ran);
        super.po_insert(this.grass);
        this.ran = 5 + (int)(Math.random() * 5.0);
        this.bug.Bug(this.ran);
        this.ran = 5 + (int)(Math.random() * 5.0);
        this.flight.Flight(this.ran);
        super.po_insert(this.bug);
        super.po_insert(this.flight);
        this.People();
    }
}
