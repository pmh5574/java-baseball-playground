package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.channels.IllegalChannelGroupException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BallNumLimitTest {

    @Test
    void 숫자_1_9까지_테스트() {
        BallNumber ballNumLimit = new BallNumber(9);

        assertThat(ballNumLimit).isNotNull();
    }

    @Test
    void 숫자_1_9초과_테스트() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BallNumber(10);
        });
    }
}
