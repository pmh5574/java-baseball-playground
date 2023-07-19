package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("1,2 ,로 split 했을때 잘분리되는지 테스트")
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }

    @Test
    @DisplayName("1 ,로 split 했을때 잘분리되는지 테스트")
    void split2() {
        String[] actual = "1".split(",");
        assertThat(actual).contains("1");
    }

    @Test
    @DisplayName("(1,2) 값이 주어졌을 때 substring() 메소드를 활용해 ()을 제거하고 1,2를 반환하도록 구현한다.")
    void substring() {
        String str = "(1,2)";
        String actual = str.substring(1,str.length()-1);
        assertThat(actual).isEqualTo("1,2");
    }
}
