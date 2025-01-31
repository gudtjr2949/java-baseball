package baseball.model.player;

import baseball.util.PlayerConstant;
import baseball.util.Validator;

public class PlayerRetryNumber {
    private String playerRetryNumbers;

    public PlayerRetryNumber(String playerRetryNumber) {
        validateRetryNumber(playerRetryNumber);
        this.playerRetryNumbers = playerRetryNumber;
    }

    private void validateRetryNumber(String playerRetryNumber) {
        Validator.isLength(playerRetryNumber, PlayerConstant.RETRY_LENGTH);
        Validator.isNotInteger(playerRetryNumber);
        Validator.isNotOneOrTwo(playerRetryNumber);
    }

    public String getPlayerRetryNumbers() {
        return playerRetryNumbers;
    }
}
