package fighting;

public class Dwell {
    public Dwell() {
    }

    void Dwell(int dwell) {
        try {
            Thread.sleep((long)dwell);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }

    }
}
