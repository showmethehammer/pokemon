//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package monster;

import skill.Skill;
import thread.AtBGM;
import thread.Dock;

public class Pokemon {
    public boolean life = true;
    public int level = 0;
    int level_log = 0;
    boolean evolution_1 = false;
    boolean evolution_2 = false;
    int evolution_1_level = 15;
    int evolution_2_level = 30;
    public String[] mons_name = new String[3];
    public String name = "";
    public String type_name = "";
    public int type_cts = 0;
    public int hp = 0;
    public int hp_def = 0;
    public int hp_up = 0;
    public int dock_atde = 0;
    public int hp_cts = 0;
    public int mp = 0;
    public int mp_def = 0;
    public int mp_up = 0;
    public int mp_cts = 0;
    public int exe = 0;
    public int exe_cts = 10;
    public int exe_up = 2;
    public int exe_point;
    public int attack = 0;
    public int attack_up = 0;
    public int shield = 0;
    public int shield_up = 0;
    public Skill skill_1 = new Skill();
    public Skill skill_2 = new Skill();
    public Skill skill_3 = new Skill();
    public Skill skill_4 = new Skill();
    String[] skill_name = new String[4];
    int[] skill_AtPer = new int[4];
    int[] skill_type = new int[4];
    int[] skill_mpdown = new int[4];
    public int[] skill_haveLv = new int[4];
    public boolean dock_de = false;

    public Pokemon() {
    }

    void Pokemon(int level, String name) {
        Textout elec = new Textout();
        this.level = level;
        if (this.level < this.evolution_1_level) {
            System.out.println("이름: " + this.mons_name[0]);
            elec.Textout(this.mons_name[0]);
        } else if (this.level < this.evolution_2_level && this.level >= this.evolution_1_level) {
            this.evolution_1 = true;
            System.out.println("이름: " + this.mons_name[1]);
            elec.Textout(this.mons_name[1]);
        } else if (this.level >= this.evolution_2_level) {
            this.evolution_1 = true;
            this.evolution_2 = true;
            System.out.println("이름: " + this.mons_name[2]);
            elec.Textout(this.mons_name[2]);
        }

        this.skill_1.Skill(this.skill_name[0], this.attack, 0, this.skill_type[0]);
        this.skill_2.Skill(this.skill_name[1], this.attack + this.attack / 10 * this.skill_AtPer[1], this.skill_mpdown[1], this.skill_type[1]);
        this.skill_3.Skill(this.skill_name[2], this.attack + this.attack / 10 * this.skill_AtPer[2], this.skill_mpdown[2], this.skill_type[2]);
        this.skill_4.Skill(this.skill_name[3], this.attack + this.attack / 10 * this.skill_AtPer[3], this.skill_mpdown[3], this.skill_type[3]);
        this.exe = 5 * this.level;
        this.hp = this.hp_def + this.hp_up * (this.level - 1);
        this.hp_cts = this.hp;
        this.mp = this.mp_def + this.mp_up * (this.level - 1);
        this.mp_cts = this.mp;
        this.attack += this.attack_up * this.level - 1;
        this.shield += this.shield_up * this.level - 1;
    }

    public void Pokemon(int level) {
        new Textout();
        this.level = level;
        if (this.level < this.evolution_1_level) {
            this.name = this.mons_name[0];
        } else if (this.level < this.evolution_2_level && this.level >= this.evolution_1_level) {
            this.evolution_1 = true;
            this.name = this.mons_name[1];
        } else if (this.level >= this.evolution_2_level) {
            this.evolution_1 = true;
            this.evolution_2 = true;
            this.name = this.mons_name[2];
        }

        this.skill_1.Skill(this.skill_name[0], this.attack, 0, this.skill_type[0]);
        this.skill_2.Skill(this.skill_name[1], this.attack + this.attack / 10 * this.skill_AtPer[1], this.skill_mpdown[1], this.skill_type[1]);
        this.skill_3.Skill(this.skill_name[2], this.attack + this.attack / 10 * this.skill_AtPer[2], this.skill_mpdown[2], this.skill_type[2]);
        this.skill_4.Skill(this.skill_name[3], this.attack + this.attack / 10 * this.skill_AtPer[3], this.skill_mpdown[3], this.skill_type[3]);
        this.exe_point = 2 * this.level;
        this.exe = 5 * this.level;
        this.hp = this.hp_def + this.hp_up * (this.level - 1);
        this.hp_cts = this.hp;
        this.mp = this.mp_def + this.mp_up * (this.level - 1);
        this.mp_cts = this.mp;
        this.attack += this.attack_up * this.level - 1;
        this.shield += this.shield_up * this.level - 1;
    }

    public void lv_check(int exe) {
        Textout elec = new Textout();
        this.exe_cts += exe;
        this.level_log = this.level;
        if (this.exe < this.exe_cts) {
            ++this.level;
            this.exe_cts -= this.exe;
            this.exe = 5 * this.level;
            System.out.println("레벨업!!");
        }

        if (this.level >= this.evolution_1_level && !this.evolution_1) {
            System.out.println("!!진화!!\n" + this.mons_name[1]);
            elec.Textout(this.mons_name[1]);
        }

        if (this.level >= this.evolution_2_level && !this.evolution_2) {
            System.out.println("!!진화!!\n" + this.mons_name[2]);
            elec.Textout(this.mons_name[2]);
        }

        if (this.level != this.level_log) {
            this.level_log = this.level;
            this.Pokemon(this.level);
        }

    }

    public void stat() {
        Textout elec = new Textout();
        System.out.println("---정보---");
        if (this.level < this.evolution_1_level) {
            System.out.println("이름: " + this.mons_name[0]);
            elec.Textout(this.mons_name[0]);
        } else if (this.level < this.evolution_2_level && this.level >= this.evolution_1_level) {
            System.out.println("이름: " + this.mons_name[1]);
            elec.Textout(this.mons_name[1]);
        } else if (this.level >= this.evolution_2_level) {
            System.out.println("이름: " + this.mons_name[2]);
            elec.Textout(this.mons_name[2]);
        }

        System.out.println("Level: " + this.level);
        System.out.println("타입: " + this.type_name);
        System.out.println("HP: " + this.hp_cts + "/" + this.hp);
        System.out.println("MP: " + this.mp_cts + "/" + this.mp);
        System.out.println("EXE: " + this.exe_cts + "/" + this.exe);
        System.out.println("At: " + this.attack);
        System.out.println("Sh: " + this.shield);
        this.skill_1.Skill(this.skill_name[0], this.attack, 0, this.skill_type[0]);
        this.skill_2.Skill(this.skill_name[1], this.attack + this.attack / 10 * this.skill_AtPer[1], this.skill_mpdown[1], this.skill_type[1]);
        this.skill_3.Skill(this.skill_name[2], this.attack + this.attack / 10 * this.skill_AtPer[2], this.skill_mpdown[2], this.skill_type[2]);
        this.skill_4.Skill(this.skill_name[3], this.attack + this.attack / 10 * this.skill_AtPer[3], this.skill_mpdown[3], this.skill_type[3]);
        System.out.println("///////////////////////////////////\n//////보유기술//////");
        System.out.println("1." + this.skill_name[0]);
        if (this.level >= this.skill_haveLv[1]) {
            System.out.println("2." + this.skill_name[1]);
        }

        if (this.level >= this.skill_haveLv[2]) {
            System.out.println("3." + this.skill_name[2]);
        }

        if (this.level >= this.skill_haveLv[3]) {
            System.out.println("4." + this.skill_name[3]);
        }

    }

    public void hp_demage(Skill at, Pokemon my) {
        if (at.type == 1) {
            AtBGM atbgm = new AtBGM();
            String mp3bgm = "공격.mp3";
            atbgm.AtBGM(mp3bgm);
            atbgm.start();
            this.hp_cts -= at.attack;
            if (this.hp_cts < 0) {
                this.hp_cts = 0;
            }

            if (this.hp_cts == 0) {
                this.life = false;
            }
        } else if (at.type == 2) {
            Dock dock = new Dock();
            this.dock_atde = my.level / 2;
            dock.Dock(my);
            this.dock_de = true;
            dock.start();
        }

    }

    public void dock() {
        if (this.hp_cts < 0) {
            this.hp_cts = 0;
        }

        if (this.hp_cts == 0) {
            this.life = false;
        }

    }

    public void skill_at(Skill at) {
        this.mp_cts -= at.mp_minus;
    }

    public boolean skill_at_ch(Skill at) {
        return this.mp_cts >= at.mp_minus;
    }

    public void skill_list() {
        System.out.println("1." + this.skill_name[0]);
        if (this.level >= this.skill_haveLv[1]) {
            System.out.println("2." + this.skill_name[1]);
        }

        if (this.level >= this.skill_haveLv[2]) {
            System.out.println("3." + this.skill_name[2]);
        }

        if (this.level >= this.skill_haveLv[3]) {
            System.out.println("4." + this.skill_name[3]);
        }

    }

    public void simple_stat() {
        System.out.println("이름: " + this.name);
        System.out.println("HP: " + this.hp_cts + "/" + this.hp);
        System.out.println("MP: " + this.mp_cts + "/" + this.mp);
    }
}
