//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package thread;

import jaco.mp3.player.MP3Player;
import java.io.File;

public class BGM extends Thread {
    String start = "";
    public boolean stop = true;

    public BGM() {
    }

    public void BGM() {
    }

    public void BGM(String bgmFileName) {
        this.start = bgmFileName;
    }

    public void run() {
        File file1 = new File("");
        File file = new File(file1.getAbsoluteFile() + "\\src\\mp3\\" + this.start);

        int time = 3;

        while(time < 4) {
            try {
                MP3Player mp3Player = new MP3Player(new File[]{file});
                mp3Player.play();

                while(!mp3Player.isStopped() && this.stop) {
                    Thread.sleep(500L);
                }

                mp3Player.stop();
            } catch (Exception var4) {
                System.err.println(var4.getMessage());
            }
        }

    }
}
