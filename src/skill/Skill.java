//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package skill;

public class Skill {
    public String skill_name = "";
    public int attack = 0;
    public int type = 0;
    public int mp_minus = 0;

    public Skill() {
    }

    public void Skill(String name, int at, int mp, int type) {
        this.type = type;
        this.skill_name = name;
        this.attack = at;
        this.mp_minus = mp;
    }
}
