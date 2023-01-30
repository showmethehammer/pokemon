
package monster;

public class Normal extends Pokemon {
    public Normal() {
    }

    public void Normal(int level) {
        super.type_cts = 9;
        super.type_name = "노말";
        super.mons_name[0] = "잠만보";
        super.mons_name[1] = null;
        super.mons_name[2] = null;
        super.evolution_1_level = 900;
        super.evolution_2_level = 900;
        super.level = level;
        super.attack = 15;
        super.attack_up = 5;
        super.shield = 5;
        super.shield_up = 1;
        super.hp_def = 40;
        super.hp_up = 20;
        super.mp_def = 10;
        super.mp_up = 2;
        super.exe_cts = 0;
        super.skill_name[0] = "몸통박치기";
        super.skill_type[0] = 1;
        super.skill_haveLv[0] = 0;
        super.skill_AtPer[0] = 0;
        super.skill_mpdown[0] = 0;
        super.skill_name[1] = "힘껏치기";
        super.skill_type[1] = 1;
        super.skill_haveLv[1] = 10;
        super.skill_AtPer[1] = 2;
        super.skill_mpdown[1] = 5;
        super.skill_name[2] = "메가톤펀치";
        super.skill_type[2] = 1;
        super.skill_haveLv[2] = 20;
        super.skill_AtPer[2] = 5;
        super.skill_mpdown[2] = 10;
        super.skill_name[3] = "냉동펀치";
        super.skill_type[3] = 1;
        super.skill_haveLv[3] = 30;
        super.skill_AtPer[3] = 10;
        super.skill_mpdown[3] = 20;
        this.Pokemon(level);
    }
}
