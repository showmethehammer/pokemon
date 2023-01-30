

package userset;

import java.util.Scanner;
import npc.User;

public class User_Set {
    public User_Set() {
    }

    public void User_Set(User user) {
        Scanner sc = new Scanner(System.in);
        user.People();
        System.out.println("원하는 원하시는것을 선택하세요.");
        System.out.println("1.몬스터 상세정보   2.몬스터 삭제   3.아이템 사용   4.나가기");

        int choice_1;
        for(choice_1 = sc.nextInt(); choice_1 < 1 || choice_1 > 4; choice_1 = sc.nextInt()) {
            System.out.println("잘못입력하였습니다. 다시입력하세요.");
        }

        int i;
        int choice_2;
        switch (choice_1) {
            case 1:
                System.out.println("확인하고싶은 포켓몬을 선택하세요.");

                for(i = 0; i < user.mypet.length; ++i) {
                    if (user.mypet[i] != null) {
                        System.out.println(i + 1 + "." + user.mypet[i].name);
                    }
                }

                for(choice_2 = sc.nextInt(); choice_2 < 1 || choice_2 > 6; choice_2 = sc.nextInt()) {
                    System.out.println("잘못입력하였습니다. 다시입력하세요.");
                }

                if (user.mypet[choice_2 - 1] != null) {
                    user.mypet[choice_2 - 1].stat();
                } else {
                    System.out.println("빈슬롯을 선택했습니다.");
                }
                break;
            case 2:
                System.out.println("삭제하고싶은 포켓몬을 선택하세요.");

                for(i = 0; i < user.mypet.length; ++i) {
                    if (user.mypet[i] != null) {
                        System.out.println(i + 1 + "." + user.mypet[i].name);
                    }
                }

                for(choice_2 = sc.nextInt(); choice_2 < 1 || choice_2 > 6; choice_2 = sc.nextInt()) {
                    System.out.println("잘못입력하였습니다. 다시입력하세요.");
                }

                if (user.mypet[choice_2 - 1] != null) {
                    user.del(choice_2 - 1);
                } else {
                    System.out.println("빈슬롯을 선택했습니다.");
                }
                break;
            case 3:
                System.out.println("사용하고싶은 포켓몬을 선택하세요.");

                for(i = 0; i < user.mypet.length; ++i) {
                    if (user.mypet[i] != null) {
                        System.out.println(i + 1 + "." + user.mypet[i].name);
                    }
                }

                for(choice_2 = sc.nextInt(); choice_2 < 1 || choice_2 > 6; choice_2 = sc.nextInt()) {
                    System.out.println("잘못입력하였습니다. 다시입력하세요.");
                }

                if (user.mypet[choice_2 - 1] != null) {
                    System.out.println("사용하려는 아이템을 선택하세요");
                    String[] choice_name = new String[5];
                    String[] choice_log = new String[]{user.heal_hi.heal_name, user.heal_mi.heal_name, user.mp_hi.mp_name, user.mp_mi.mp_name, user.dock_clear.name};
                    int log = 0;
                    if (0 < choice_name.length) {
                        if (user.heal_hi.ea > 0) {
                            System.out.println(i + 1 + "." + user.heal_hi.heal_name + "   수량: " + user.heal_hi.ea);
                            choice_name[i] = user.heal_hi.heal_name;
                            ++i;
                        }

                        if (user.heal_mi.ea > 0) {
                            System.out.println(i + 1 + "." + user.heal_mi.heal_name + "   수량: " + user.heal_mi.ea);
                            choice_name[i] = user.heal_mi.heal_name;
                            ++i;
                        }

                        if (user.mp_hi.ea > 0) {
                            System.out.println(i + 1 + "." + user.mp_hi.mp_name + "   수량: " + user.mp_hi.ea);
                            choice_name[i] = user.mp_hi.mp_name;
                            ++i;
                        }

                        if (user.mp_mi.ea > 0) {
                            System.out.println(i + 1 + "." + user.mp_mi.mp_name + "   수량: " + user.mp_mi.ea);
                            choice_name[i] = user.mp_mi.mp_name;
                            ++i;
                        }

                        if (user.dock_clear.ea > 0) {
                            System.out.println(i + 1 + "." + user.dock_clear.name + "   수량: " + user.dock_clear.ea);
                            choice_name[i] = user.dock_clear.name;
                            ++i;
                        }

                        log = i;
                    }

                    if (log == 0) {
                        System.out.println("아이템이 없습니다.");
                    } else {
                        int choice_3;
                        for(choice_3 = sc.nextInt(); choice_3 < 1 || choice_3 > log; choice_3 = sc.nextInt()) {
                            System.out.println("잘못입력하였습니다. 다시입력하세요.");
                        }

                        if (choice_name[choice_3 - 1] == user.heal_hi.heal_name) {
                            choice_3 = 1;
                        } else if (choice_name[choice_3 - 1] == user.heal_mi.heal_name) {
                            choice_3 = 2;
                        } else if (choice_name[choice_3 - 1] == user.mp_hi.mp_name) {
                            choice_3 = 3;
                        } else if (choice_name[choice_3 - 1] == user.mp_mi.mp_name) {
                            choice_3 = 4;
                        } else if (choice_name[choice_3 - 1] == user.dock_clear.name) {
                            choice_3 = 5;
                        }

                        switch (choice_3) {
                            case 1:
                                user.hp_reco(user.heal_hi, choice_2);
                                break;
                            case 2:
                                user.hp_reco(user.heal_mi, choice_2);
                                break;
                            case 3:
                                user.mp_reco(user.mp_hi, choice_2);
                                break;
                            case 4:
                                user.mp_reco(user.mp_mi, choice_2);
                                break;
                            case 5:
                                user.dock_clear_exe(user.dock_clear, choice_2);
                        }
                    }
                } else {
                    System.out.println("빈슬롯을 선택했습니다.");
                }
        }

    }
}
