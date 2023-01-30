//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package market;

public class Mp {
    public String mp_name = "마나약";
    public int ea = 0;
    public int mp_up = 100;

    public Mp() {
    }

    public void in(int in) {
        this.ea += in;
    }

    public void use() {
        --this.ea;
    }
}
