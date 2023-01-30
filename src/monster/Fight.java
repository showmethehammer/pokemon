//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package monster;

public class Fight extends Pokemon {
    public Fight() {
    }

    public void Fight(int level) {
        super.type_cts = 8;
        super.type_name = "격투";
        super.mons_name[0] = "망키";
        super.mons_name[1] = "성원숭";
        super.mons_name[2] = null;
        super.evolution_1_level = 20;
        super.evolution_2_level = 900;
        super.level = level;
        super.attack = 10;
        super.attack_up = 2;
        super.shield = 5;
        super.shield_up = 1;
        super.hp_def = 60;
        super.hp_up = 15;
        super.mp_def = 20;
        super.mp_up = 3;
        super.exe_cts = 0;
        super.skill_name[0] = "몸통박치기";
        super.skill_type[0] = 1;
        super.skill_haveLv[0] = 0;
        super.skill_AtPer[0] = 0;
        super.skill_mpdown[0] = 0;
        super.skill_name[1] = "마구때리기";
        super.skill_type[1] = 1;
        super.skill_haveLv[1] = 10;
        super.skill_AtPer[1] = 2;
        super.skill_mpdown[1] = 5;
        super.skill_name[2] = "메가톤펀치";
        super.skill_type[2] = 1;
        super.skill_haveLv[2] = 20;
        super.skill_AtPer[2] = 5;
        super.skill_mpdown[2] = 10;
        super.skill_name[3] = "폭발펀치";
        super.skill_type[3] = 1;
        super.skill_haveLv[3] = 30;
        super.skill_AtPer[3] = 10;
        super.skill_mpdown[3] = 20;
        this.Pokemon(level);
    }
}
