package baseball.model.player;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PlayerNumberTest {


    @Test
    void 사용자_입력값_길이_3보다_짧거나_김() {
        // given
        String shortThenThree = "12";

        // when & then
        assertThatThrownBy(() -> new PlayerNumber(shortThenThree)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사용자_입력값_같은_숫자_포함() {
        // given
        String containsSameInput = "111";

        // when & then
        assertThatThrownBy(() -> new PlayerNumber(containsSameInput)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사용자_입력값_정수로만_이루어지지_않음() {
        // given
        String notInt = "111";

        // when & then
        assertThatThrownBy(() -> new PlayerNumber(notInt)).isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    void 사용자_입력숫자_검증_성공() {
        // given
        String normalInput = "123";

        // when & then
        assertThat(new PlayerNumber(normalInput).getPlayerNumbers()).isEqualTo(normalInput);
    }
}