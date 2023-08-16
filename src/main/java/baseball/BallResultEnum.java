package baseball;

public enum BallResultEnum {
    STRIKE, BALL, NOTHING;

    public static boolean isStrike(BallResultEnum result) {
        return BallResultEnum.STRIKE == result;
    }

    public static boolean isBall(BallResultEnum result) {
        return BallResultEnum.BALL == result;
    }
}

