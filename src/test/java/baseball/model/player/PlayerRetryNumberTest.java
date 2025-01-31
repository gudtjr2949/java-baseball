package baseball.model.player;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PlayerRetryNumberTest {

    @Test
    void 사용자_입력값_길이_1보다_짧거나_김() {
        // given
        String shortInput = "";
        String longInput = "12";

        // when & then
        assertThatThrownBy(() -> new PlayerRetryNumber(shortInput)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new PlayerRetryNumber(longInput)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사용자_입력값_정수_아님() {
        // given
        String notInteger = "a";

        // when & then
        assertThatThrownBy(() -> new PlayerRetryNumber(notInteger)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사용자_입력값_1이거나_2여야함() {
        // given
        String notOneOrTwo = "3";

        // when & then
        assertThatThrownBy(() -> new PlayerRetryNumber(notOneOrTwo)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사용자_입력값_검증_성공() {
        // given
        String retryInput = "1";
        String endInput = "2";

        // when
        PlayerRetryNumber retryNumber = new PlayerRetryNumber(retryInput);
        PlayerRetryNumber endNumber = new PlayerRetryNumber(endInput);

        // then
        assertThat(retryNumber.getPlayerRetryNumbers()).isEqualTo(retryInput);
        assertThat(endNumber.getPlayerRetryNumbers()).isEqualTo(endInput);
    }
}