package baseball.model.player;

import baseball.util.Validator;

public class PlayerNumber {
    private String playerNumbers;

    public PlayerNumber(String playerNumber) {
        // 입력값 검증
        validatePlayerNumber(playerNumber);
        this.playerNumbers = playerNumber;
    }

    private void validatePlayerNumber(String playerNumber) {
        Validator.isLengthThree(playerNumber);
        Validator.isNotInteger(playerNumber);
        Validator.isContainsSameInt(playerNumber);
    }

    public String getPlayerNumbers() {
        return playerNumbers;
    }
}
