package study;

import game.BaseballGame;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseballTest {

    @Test
    @DisplayName("숫자야구게임")
    void game() {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.game();
    }
}
