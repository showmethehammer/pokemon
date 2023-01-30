//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package thread;

import monster.Pokemon;

public class Dock extends Thread {
    Pokemon poketmon = new Pokemon();

    public Dock() {
    }

    public void Dock() {
    }

    public void Dock(Pokemon my) {
        this.poketmon = my;
    }

    public void run() {
        while(this.poketmon.life && this.poketmon.dock_de) {
            AtBGM atbgm = new AtBGM();
            String mp3bgm = "독.mp3";
            atbgm.AtBGM(mp3bgm);
            atbgm.start();
            Pokemon var10000 = this.poketmon;
            var10000.hp_cts -= this.poketmon.dock_atde;
            this.poketmon.dock();

            try {
                Thread.sleep(3000L);
            } catch (InterruptedException var4) {
                throw new RuntimeException(var4);
            }
        }

        this.poketmon.dock_atde = 0;
    }
}
