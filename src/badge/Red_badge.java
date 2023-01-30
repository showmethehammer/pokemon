
package badge;

public class Red_badge extends Badge {
    public Red_badge() {
    }

    public void Red_badge() {
        this.badge_name = "레드뱃지";
        this.badge_have = false;
    }

    public void badge_have(boolean take) {
        this.badge_have = take;
    }
}
