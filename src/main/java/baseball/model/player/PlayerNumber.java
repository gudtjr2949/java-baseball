package baseball.model.player;

import static baseball.util.Validator.*;

public class PlayerNumber {
    private String playerNumbers;

    public PlayerNumber(String playerNumber) {
        validatePlayerNumber(playerNumber);
        this.playerNumbers = playerNumber;
    }

    private void validatePlayerNumber(String playerNumber) {
        isLengthThree(playerNumber);
        isNotInteger(playerNumber);
        isContainsSameInteger(playerNumber);
    }

    public String getPlayerNumbers() {
        return playerNumbers;
    }
}
