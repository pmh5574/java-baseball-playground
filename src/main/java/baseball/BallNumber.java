package baseball;

import java.util.Objects;

public class BallNumber {

    private static int MIN_NO = 1;
    private static int MAX_NO = 9;

    private final int no;

    public BallNumber(int ball) {
        if (ball > MAX_NO || ball < MIN_NO) {
            throw new IllegalArgumentException("잘못된 범위 입니다.");
        }

        this.no = ball;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BallNumber)) return false;
        BallNumber that = (BallNumber) o;
        return no == that.no;
    }
}
