package baseball;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallNumTest {

    @Test
    void 숫자_1_9까지_테스트() {
        BallNum ballNum = new BallNum();

        assertThat(ballNum.check(9)).isTrue();
    }

    @Test
    void 숫자_1_9초과_테스트() {
        BallNum ballNum = new BallNum();

        assertThat(ballNum.check(10)).isFalse();
    }
}
