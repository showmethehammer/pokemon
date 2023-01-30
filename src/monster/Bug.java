
package monster;

public class Bug extends Pokemon {
    public Bug() {
    }

    public void Bug(int level) {
        super.type_cts = 10;
        super.type_name = "벌레";
        super.mons_name[0] = "캐터피";
        super.mons_name[1] = "단데기";
        super.mons_name[2] = "버터풀";
        super.evolution_1_level = 10;
        super.evolution_2_level = 20;
        super.level = level;
        super.attack = 10;
        super.attack_up = 5;
        super.shield = 5;
        super.shield_up = 1;
        super.hp_def = 30;
        super.hp_up = 5;
        super.mp_def = 30;
        super.mp_up = 5;
        super.exe_cts = 0;
        super.skill_name[0] = "몸통박치기";
        super.skill_type[0] = 1;
        super.skill_haveLv[0] = 0;
        super.skill_AtPer[0] = 0;
        super.skill_mpdown[0] = 0;
        super.skill_name[1] = "실뿜기";
        super.skill_type[1] = 1;
        super.skill_haveLv[1] = 10;
        super.skill_AtPer[1] = 2;
        super.skill_mpdown[1] = 5;
        super.skill_name[2] = "독가루";
        super.skill_type[2] = 2;
        super.skill_haveLv[2] = 20;
        super.skill_AtPer[2] = 5;
        super.skill_mpdown[2] = 10;
        super.skill_name[3] = "은빛날개";
        super.skill_type[3] = 1;
        super.skill_haveLv[3] = 30;
        super.skill_AtPer[3] = 10;
        super.skill_mpdown[3] = 20;
        this.Pokemon(level);
    }
}
