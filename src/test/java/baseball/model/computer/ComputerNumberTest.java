package baseball.model.computer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class ComputerNumberTest {

    @Test
    void 컴퓨터숫자_랜덤생성_길이3() {
        // given
        ComputerNumber computerNumber = new ComputerNumber();
        int numberLength = 3;

        // when & then
        assertThat(computerNumber.getComputerNumber().length()).isEqualTo(numberLength);
    }


}