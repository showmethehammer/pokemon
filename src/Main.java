import java.util.Scanner;
import map.Blue_City;
import map.FureKing_Castle;
import map.Gray_City;
import map.Gray_Grass;
import map.Hunting_Field;
import map.Mu_castle;
import map.Red_City;
import map.Red_Volcano;
import map.Rock_Mount;
import map.Sanglock_City;
import map.Sanglock_Grass;
import map.Tacho_vill;
import map.Tahoa;
import map.Training_Valley;
import monster.Electricity;
import monster.Fire;
import monster.Grass;
import monster.Pokemon;
import monster.Textout;
import monster.Water;
import npc.PokemonCenter;
import npc.User;
import thread.BGM;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new PokemonCenter();
        Electricity pet1 = new Electricity();
        Fire pet2 = new Fire();
        Water pet3 = new Water();
        Grass pet4 = new Grass();
        new Pokemon();
        new Pokemon();
        User user = new User();
        Textout logo = new Textout();
        Tacho_vill tacho_vill = new Tacho_vill();
        Sanglock_Grass sanglock_grass = new Sanglock_Grass();
        Sanglock_City sanglock_city = new Sanglock_City();
        Gray_Grass gray_grass = new Gray_Grass();
        Tahoa tahoa = new Tahoa();
        Gray_City gray_city = new Gray_City();
        Training_Valley training_valley = new Training_Valley();
        Blue_City blue_city = new Blue_City();
        Red_Volcano red_volcano = new Red_Volcano();
        Red_City red_city = new Red_City();
        Hunting_Field hunting_field = new Hunting_Field();
        Rock_Mount rock_mount = new Rock_Mount();
        FureKing_Castle fureKing_castle = new FureKing_Castle();
        Mu_castle mu_castle = new Mu_castle();
        Scanner sc = new Scanner(System.in);
        String mp3bgm = "시작bgm.mp3";
        BGM bgm = new BGM();
        bgm.BGM(mp3bgm);
        bgm.start();
        logo.Textout("로고");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("포켓몬 여행을 시작합니다.");
        System.out.println("당신의 이름을 입력하세요.");
        String user_name = sc.nextLine();
        System.out.println("모험을 시작합니다. 원하시는포켓몬 속성을 선택하세요");

        while(true) {
            System.out.println("1.전기 2.불 3,물 4.풀 ");

            int choice;
            for(choice = sc.nextInt(); choice < 1 || choice > 4; choice = sc.nextInt()) {
                System.out.println("잘못입력하였습니다. 다시입력하세요.");
            }

            switch (choice) {
                case 1:
                    pet1.Electricity(10);
                    pet1.stat();
                    break;
                case 2:
                    pet2.Fire(100);
                    pet2.stat();
                    break;
                case 3:
                    pet3.Water(100);
                    pet3.stat();
                    break;
                case 4:
                    pet4.Grass(100);
                    pet4.stat();
            }

            System.out.println("현재 선택함 포캣몬을 선택하시겠습니까?");

            while(true) {
                System.out.println("1.예   2.아니오");
                int choice_1 = sc.nextInt();
                if (choice_1 == 1 || choice_1 == 2) {
                    if (choice_1 == 1) {
                        switch (choice) {
                            case 1:
                                user.User(user_name, pet1);
                                break;
                            case 2:
                                user.User(user_name, pet2);
                                break;
                            case 3:
                                user.User(user_name, pet3);
                                break;
                            case 4:
                                user.User(user_name, pet4);
                        }

                        user.mypet[0].stat();
                        user.People();
                        bgm.stop = false;
                        bgm = null;

                        do {
                            switch (user.map_move) {
                                case 1:
                                    tacho_vill.Tacho_vill(user);
                                    break;
                                case 2:
                                    sanglock_grass.Sanglock_Grass(user);
                                    break;
                                case 3:
                                    sanglock_city.Sanglock_City(user);
                                    break;
                                case 4:
                                    gray_grass.Gray_Grass(user);
                                    break;
                                case 5:
                                    tahoa.Tahoa(user);
                                    break;
                                case 6:
                                    gray_city.Gray_City(user);
                                    break;
                                case 7:
                                    training_valley.Training_Valley(user);
                                    break;
                                case 8:
                                    blue_city.Blue_City(user);
                                    break;
                                case 9:
                                    red_volcano.Red_Volcano(user);
                                    break;
                                case 10:
                                    red_city.Red_City(user);
                                    break;
                                case 11:
                                    hunting_field.Hunting_Field(user);
                                    break;
                                case 12:
                                    rock_mount.Rock_Mount(user);
                                    break;
                                case 13:
                                    fureKing_castle.FureKing_Castle(user);
                                    break;
                                case 14:
                                    mu_castle.Mu_castle(user);
                            }
                        } while(user.map_move != 99);

                        return;
                    }

                    if (choice_1 == 2) {
                        System.out.println("현재 선택할 포켓몬을 선택하지 않았습니다.");
                    }
                    break;
                }

                System.out.println("다시입력하세요.");
            }
        }
    }
}
