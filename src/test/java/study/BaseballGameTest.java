package study;

import game.BaseballGame;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class BaseballGameTest {

    private BaseballGame baseballGame;

    @BeforeEach
    void setUp() {
        baseballGame = new BaseballGame();
    }

    @Test
    @DisplayName("play 1볼 2스트라이크일때 함수 테스트 코드")
    void play() {
        assertThat(baseballGame.play(1, 2)).isEqualTo("1볼 2스트라이크");
    }

    @Test
    @DisplayName("play 3개 모두 맞췄을 때 함수 테스트 코드")
    void endPlay() {
        assertThat(baseballGame.play(0, 3)).isEqualTo("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    }

    @Test
    @DisplayName("스트라이크 일때")
    void checkStrikeCount() {
        assertThat(baseballGame.checkStrikeCount("1", "1")).isEqualTo(1);
    }

    @Test
    @DisplayName("스트라이크가 아닐때")
    void checkStrikeNoCount() {
        assertThat(baseballGame.checkStrikeCount("1", "0")).isEqualTo(0);
    }

    @Test
    @DisplayName("볼 일때")
    void checkBallCount() {
        assertThat(baseballGame.checkBallCount(2, "1", "123")).isEqualTo(1);
    }

    @Test
    @DisplayName("볼이 아닐때")
    void checkBallNoCount() {
        assertThat(baseballGame.checkBallCount(1, "4", "123")).isEqualTo(0);
    }
}
