//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package npc;

import java.util.Scanner;
import monster.Pokemon;
import thread.BGM;

public class PokemonCenter {
    public PokemonCenter() {
    }

    public void PokemonCenter(Pokemon[] a) {
        String mp3bgm = "포켓몬센터bgm.mp3";
        BGM bgm = new BGM();
        bgm.BGM(mp3bgm);
        bgm.start();
        System.out.println("회복을 하시겠습니까?");
        System.out.println("1.예    2.아니오(나가기)");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            for(int i = 0; i < a.length && a[i] != null; ++i) {
                a[i].hp_cts = a[i].hp;
                a[i].mp_cts = a[i].mp;
                a[i].dock_de = false;
                a[i].life = true;
            }

            System.out.println("회복완료");
        } else {
            System.out.println("포켓몬센터를 나갑니다.");
        }

        bgm.stop = false;
        bgm = null;
    }

    public void loss(Pokemon[] a) {
        for(int i = 0; i < a.length && a[i] != null; ++i) {
            a[i].hp_cts = a[i].hp;
            a[i].mp_cts = a[i].mp;
            a[i].dock_de = false;
            a[i].life = true;
        }

    }
}
