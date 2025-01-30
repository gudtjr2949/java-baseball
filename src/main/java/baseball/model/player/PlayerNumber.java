package baseball.model.player;

import java.util.HashSet;
import java.util.Set;

public class PlayerNumber {
    private String playerNumbers;

    public PlayerNumber(String playerNumber) {
        // 입력값 검증
        validatePlayerNumber(playerNumber);
        this.playerNumbers = playerNumber;
    }

    private void validatePlayerNumber(String playerNumber) {
        isLengthThree(playerNumber);
        isNotInteger(playerNumber);
        isContainsSameInt(playerNumber);
    }

    private void isContainsSameInt(String inputNumber) {
        Set<Character> set = new HashSet<>();

        for (char c : inputNumber.toCharArray()) {
            set.add(c);
        }

        if (set.size() != 3) throw new IllegalArgumentException();
    }

    private void isNotInteger(String inputNumber) {
        if (!inputNumber.matches("-?\\d+")) throw new IllegalArgumentException();
    }

    private void isLengthThree(String inputNumber) {
        if (inputNumber.length() != 3) throw new IllegalArgumentException();
    }

    public String getPlayerNumbers() {
        return playerNumbers;
    }
}
