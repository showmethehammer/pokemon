//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package thread;

import jaco.mp3.player.MP3Player;
import java.io.File;

public class AtBGM extends Thread {
    String start = "";

    public AtBGM() {
    }

    public void AtBGM(String bgmFile) {
        this.start = bgmFile;
    }

    public void run() {

        File file1 = new File("");
        File file = new File(file1.getAbsoluteFile() + "\\src\\mp3\\" + this.start);

        try {
            MP3Player mp3Player = new MP3Player(new File[]{file});
            mp3Player.play();

            while(!mp3Player.isStopped()) {
                Thread.sleep(500L);
            }
        } catch (Exception var3) {
            System.err.println(var3.getMessage());
        }

    }
}
