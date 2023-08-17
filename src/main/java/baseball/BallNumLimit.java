package baseball;

public class BallNumLimit {

    public Boolean check(int num) {
        if (num > 9 || num < 1) {
            return false;
        }
        return true;
    }
}
