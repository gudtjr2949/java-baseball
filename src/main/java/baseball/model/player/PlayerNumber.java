package baseball.model.player;

import baseball.util.GameConstant;

import static baseball.util.Validator.*;

public class PlayerNumber {
    private String playerNumbers;

    public PlayerNumber(String playerNumber) {
        validatePlayerNumber(playerNumber);
        this.playerNumbers = playerNumber;
    }

    private void validatePlayerNumber(String playerNumber) {
        isLength(playerNumber, GameConstant.BASEBALL_LENGTH);
        isNotInteger(playerNumber);
        isContainsSameInteger(playerNumber);
    }

    public String getPlayerNumbers() {
        return playerNumbers;
    }
}
