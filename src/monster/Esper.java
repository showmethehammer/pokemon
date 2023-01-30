//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package monster;

public class Esper extends Pokemon {
    public Esper() {
    }

    public void Esper(int level) {
        super.type_cts = 7;
        super.type_name = "에스퍼";
        super.mons_name[0] = "캐이시";
        super.mons_name[1] = "윤겔라";
        super.mons_name[2] = "후딘";
        super.evolution_1_level = 20;
        super.evolution_2_level = 35;
        super.level = level;
        super.attack = 15;
        super.attack_up = 8;
        super.shield = 5;
        super.shield_up = 1;
        super.hp_def = 30;
        super.hp_up = 8;
        super.mp_def = 50;
        super.mp_up = 10;
        super.exe_cts = 0;
        super.skill_name[0] = "몸통박치기";
        super.skill_type[0] = 1;
        super.skill_haveLv[0] = 0;
        super.skill_AtPer[0] = 0;
        super.skill_mpdown[0] = 0;
        super.skill_name[1] = "염동력";
        super.skill_type[1] = 1;
        super.skill_haveLv[1] = 10;
        super.skill_AtPer[1] = 3;
        super.skill_mpdown[1] = 5;
        super.skill_name[2] = "스피드스타";
        super.skill_type[2] = 1;
        super.skill_haveLv[2] = 20;
        super.skill_AtPer[2] = 8;
        super.skill_mpdown[2] = 10;
        super.skill_name[3] = "사이코키네시스";
        super.skill_type[3] = 1;
        super.skill_haveLv[3] = 30;
        super.skill_AtPer[3] = 13;
        super.skill_mpdown[3] = 20;
        this.Pokemon(level);
    }
}
