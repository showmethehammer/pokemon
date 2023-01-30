
package market;

public class Heal {
    public String heal_name = "상처약";
    public int ea = 0;
    public int hp_up = 100;

    public Heal() {
    }

    public void in(int in) {
        this.ea += in;
    }

    public void use() {
        --this.ea;
    }
}
