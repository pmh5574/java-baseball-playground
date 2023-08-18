package baseball;

public class PlayResult {

    public int strike = 0;
    public int ball = 0;

    public void result(BallResultEnum ballResultEnum) {

        if (ballResultEnum.isStrike()) {
            strike++;
        }

        if (ballResultEnum.isBall()) {
            ball++;
        }

    }
}
