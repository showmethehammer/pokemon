//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package monster;

public class Rock extends Pokemon {
    public Rock() {
    }

    public void Rock(int level) {
        super.type_cts = 6;
        super.type_name = "돌";
        super.mons_name[0] = "꼬마돌";
        super.mons_name[1] = "대구리";
        super.mons_name[2] = "딱구리";
        super.evolution_1_level = 15;
        super.evolution_2_level = 30;
        super.level = level;
        super.attack = 10;
        super.attack_up = 2;
        super.shield = 5;
        super.shield_up = 1;
        super.hp_def = 50;
        super.hp_up = 10;
        super.mp_def = 30;
        super.mp_up = 5;
        super.exe_cts = 0;
        super.skill_name[0] = "몸통박치기";
        super.skill_type[0] = 1;
        super.skill_haveLv[0] = 0;
        super.skill_AtPer[0] = 0;
        super.skill_mpdown[0] = 0;
        super.skill_name[1] = "구르기";
        super.skill_type[1] = 1;
        super.skill_haveLv[1] = 10;
        super.skill_AtPer[1] = 2;
        super.skill_mpdown[1] = 5;
        super.skill_name[2] = "스톤샤워";
        super.skill_type[2] = 1;
        super.skill_haveLv[2] = 20;
        super.skill_AtPer[2] = 5;
        super.skill_mpdown[2] = 10;
        super.skill_name[3] = "다이아스톰";
        super.skill_type[3] = 1;
        super.skill_haveLv[3] = 30;
        super.skill_AtPer[3] = 10;
        super.skill_mpdown[3] = 20;
        this.Pokemon(level);
    }
}
