package npc;

import monster.Esper;
import monster.Flight;
import monster.Water;

public class Tahoa_Npc extends People {
    int ran = 0;
    Water water = new Water();
    Esper esper = new Esper();
    Flight flight = new Flight();

    public Tahoa_Npc() {
    }

    public void Sanglock_Grass_Npc() {
        this.money_give = 1000;
        super.name = "퉁퉁이";
        this.ran = 10 + (int)(Math.random() * 5.0);
        this.water.Water(this.ran);
        this.ran = 10 + (int)(Math.random() * 5.0);
        this.esper.Esper(this.ran);
        this.ran = 10 + (int)(Math.random() * 5.0);
        this.flight.Flight(this.ran);
        super.po_insert(this.water);
        super.po_insert(this.esper);
        super.po_insert(this.flight);
        this.water = null;
        this.esper = null;
        this.flight = null;
        this.People();
    }
}
