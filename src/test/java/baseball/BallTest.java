package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallTest {

    private Ball ball;

    @BeforeEach
    void beforeEach() {
        this.ball = new Ball(1, 3);
    }


    @Test
    void 스트라이크일때() {
        assertThat(ball.play(1, 3)).isEqualTo(BallResultEnum.STRIKE);
    }

    @Test
    void 볼일때() {
        assertThat(ball.play(1, 2)).isEqualTo(BallResultEnum.BALL);
    }

    @Test
    void 낫싱일때() {
        assertThat(ball.play(2, 3)).isEqualTo(BallResultEnum.NOTHING);
    }



}
