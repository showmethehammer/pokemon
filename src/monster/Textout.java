//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package monster;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Textout {
    public Textout() {
    }

    public void Textout(String name) {
        try {
            File file1 = new File("");
            File file = new File(file1.getAbsoluteFile() + "\\src\\pokemontextpoto\\" + name + ".txt");
            FileReader file_reader = new FileReader(file);

            int cur;
            while((cur = file_reader.read()) != -1) {
                System.out.print((char)cur);
            }

            file_reader.close();
        } catch (FileNotFoundException var5) {
            var5.getStackTrace();
        } catch (IOException var6) {
            var6.getStackTrace();
        }

        System.out.println();
    }
}
