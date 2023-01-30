//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package monster;

public class Mu extends Pokemon {
    public Mu() {
    }

    public void Mu(int level) {
        super.type_cts = 11;
        super.type_name = "뮤";
        super.mons_name[0] = "뮤";
        super.mons_name[1] = null;
        super.mons_name[2] = null;
        super.evolution_1_level = 900;
        super.evolution_2_level = 900;
        super.level = level;
        super.attack = 20;
        super.attack_up = 7;
        super.shield = 5;
        super.shield_up = 1;
        super.hp_def = 50;
        super.hp_up = 10;
        super.mp_def = 40;
        super.mp_up = 8;
        super.exe_cts = 0;
        super.skill_name[0] = "염동력";
        super.skill_type[0] = 1;
        super.skill_haveLv[0] = 0;
        super.skill_AtPer[0] = 0;
        super.skill_mpdown[0] = 0;
        super.skill_name[1] = "파동탄";
        super.skill_type[1] = 1;
        super.skill_haveLv[1] = 10;
        super.skill_AtPer[1] = 5;
        super.skill_mpdown[1] = 5;
        super.skill_name[2] = "냉동빔";
        super.skill_type[2] = 1;
        super.skill_haveLv[2] = 20;
        super.skill_AtPer[2] = 10;
        super.skill_mpdown[2] = 10;
        super.skill_name[3] = "사이코키네시스";
        super.skill_type[3] = 1;
        super.skill_haveLv[3] = 30;
        super.skill_AtPer[3] = 20;
        super.skill_mpdown[3] = 20;
        this.Pokemon(level);
    }
}
