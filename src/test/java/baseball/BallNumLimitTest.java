package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallNumLimitTest {

    @Test
    void 숫자_1_9까지_테스트() {
        BallNumLimit ballNumLimit = new BallNumLimit();

        assertThat(ballNumLimit.check(9)).isTrue();
    }

    @Test
    void 숫자_1_9초과_테스트() {
        BallNumLimit ballNumLimit = new BallNumLimit();

        assertThat(ballNumLimit.check(10)).isFalse();
    }
}
