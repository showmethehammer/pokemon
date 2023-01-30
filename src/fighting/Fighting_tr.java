//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fighting;

import java.util.Random;
import java.util.Scanner;
import monster.Pokemon;

public class Fighting_tr {
    Scanner sc;
    int choice;
    Random ran;
    int log;

    public Fighting_tr() {
        this.sc = new Scanner(System.in);
        this.ran = new Random();
    }

    public void Fighting_tr(Pokemon my_2, Pokemon you_pet) {
        System.out.println("기술선택");
        boolean check = false;

        while(true) {
            my_2.skill_list();
            this.choice = this.sc.nextInt();
            this.log = 1;
            if (this.choice >= my_2.skill_haveLv[3]) {
                this.log = 4;
            } else if (this.choice >= my_2.skill_haveLv[2]) {
                this.log = 3;
            } else if (this.choice >= my_2.skill_haveLv[1]) {
                this.log = 2;
            }

            if (this.log <= this.choice && 0 < this.choice) {
                switch (this.choice) {
                    case 1:
                        if (my_2.skill_at_ch(my_2.skill_1)) {
                            check = true;
                            System.out.println("!!!!!" + my_2.name + "의 " + my_2.skill_1.skill_name + "!!!!!");
                            my_2.skill_at(my_2.skill_1);
                            you_pet.hp_demage(my_2.skill_1, you_pet);
                        }
                        break;
                    case 2:
                        if (my_2.skill_at_ch(my_2.skill_2)) {
                            check = true;
                            System.out.println("!!!!!" + my_2.name + "의 " + my_2.skill_2.skill_name + "!!!!!");
                            my_2.skill_at(my_2.skill_2);
                            you_pet.hp_demage(my_2.skill_2, you_pet);
                        }
                        break;
                    case 3:
                        if (my_2.skill_at_ch(my_2.skill_3)) {
                            check = true;
                            System.out.println("!!!!!" + my_2.name + "의 " + my_2.skill_3.skill_name + "!!!!!");
                            my_2.skill_at(my_2.skill_3);
                            you_pet.hp_demage(my_2.skill_3, you_pet);
                        }
                        break;
                    case 4:
                        if (my_2.skill_at_ch(my_2.skill_4)) {
                            check = true;
                            System.out.println("!!!!!" + my_2.name + "의 " + my_2.skill_4.skill_name + "!!!!!");
                            my_2.skill_at(my_2.skill_4);
                            you_pet.hp_demage(my_2.skill_4, you_pet);
                        }
                }

                if (!check) {
                    System.out.println("!!!!!" + my_2.skill_1.skill_name + "!!!!!");
                    my_2.skill_at(my_2.skill_1);
                    you_pet.hp_demage(my_2.skill_1, you_pet);
                }

                Dwell dwell = new Dwell();
                you_pet.simple_stat();
                System.out.println();
                check = false;
                dwell.Dwell(1000);
                if (you_pet.life) {
                    this.log = 1;
                    if (you_pet.level >= you_pet.skill_haveLv[3]) {
                        this.log = 4;
                    } else if (you_pet.level >= you_pet.skill_haveLv[2]) {
                        this.log = 3;
                    } else if (you_pet.level >= you_pet.skill_haveLv[1]) {
                        this.log = 2;
                    }

                    switch (this.ran.nextInt(this.log)) {
                        case 0:
                            if (you_pet.skill_at_ch(you_pet.skill_1)) {
                                check = true;
                                System.out.println("!!!!!" + you_pet.name + "의 " + you_pet.skill_1.skill_name + "!!!!!");
                                you_pet.skill_at(you_pet.skill_1);
                                my_2.hp_demage(you_pet.skill_1, you_pet);
                            }
                            break;
                        case 1:
                            if (you_pet.skill_at_ch(you_pet.skill_2)) {
                                check = true;
                                System.out.println("!!!!!" + you_pet.name + "의 " + you_pet.skill_2.skill_name + "!!!!!");
                                you_pet.skill_at(you_pet.skill_2);
                                my_2.hp_demage(you_pet.skill_2, you_pet);
                            }
                            break;
                        case 2:
                            if (you_pet.skill_at_ch(you_pet.skill_3)) {
                                check = true;
                                System.out.println("!!!!!" + you_pet.name + "의 " + you_pet.skill_3.skill_name + "!!!!!");
                                you_pet.skill_at(you_pet.skill_3);
                                my_2.hp_demage(you_pet.skill_3, you_pet);
                            }
                            break;
                        case 3:
                            if (you_pet.skill_at_ch(you_pet.skill_4)) {
                                check = true;
                                System.out.println("!!!!!" + you_pet.name + "의 " + you_pet.skill_4.skill_name + "!!!!!");
                                you_pet.skill_at(you_pet.skill_4);
                                my_2.hp_demage(you_pet.skill_4, you_pet);
                            }
                    }

                    if (!check) {
                        System.out.println("!!!!!" + you_pet.name + "의 " + you_pet.skill_1.skill_name + "!!!!!");
                        you_pet.skill_at(you_pet.skill_1);
                        my_2.hp_demage(you_pet.skill_1, you_pet);
                    }
                } else {
                    my_2.lv_check(you_pet.exe_point);
                }

                my_2.simple_stat();
                dwell.Dwell(1000);
                System.out.println();
                return;
            }

            System.out.println("입력 오류");
        }
    }
}
