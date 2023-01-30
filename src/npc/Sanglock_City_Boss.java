

package npc;

import badge.Green_badge;
import monster.Bug;
import monster.Flight;
import monster.Grass;

public class Sanglock_City_Boss extends Sanglock_Grass_Npc {
    Grass grass = new Grass();
    Green_badge green_badge = new Green_badge();
    Bug bug = new Bug();
    Flight flight = new Flight();

    public Sanglock_City_Boss() {
    }

    public void Sanglock_City_Boss() {
        this.money_give = 3000;
        super.name = "비주기";
        this.green_badge.Green_badge();
        this.grass.Grass(10);
        this.bug.Bug(10);
        this.flight.Flight(10);
        super.po_insert(this.grass);
        super.po_insert(this.bug);
        super.po_insert(this.flight);
        this.grass = null;
        this.bug = null;
        this.flight = null;
        this.People();
    }
}
