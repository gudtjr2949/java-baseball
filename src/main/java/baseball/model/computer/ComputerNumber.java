package baseball.model.computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {

    private String computerNumber;
    private final static int NUMBER_LENGTH = 3;


    public ComputerNumber() {
        this.computerNumber = setComputerNumber();
    }

    /**
     * 난수 생성
     * @return 컴퓨터 숫자 (난수)
     */
    public String setComputerNumber() {
        List<String> randomList = new ArrayList<>();
        for (int i = 0 ; i < NUMBER_LENGTH ; i++) {
            randomList.add(getRandomNumber());
        }

        return String.join("", randomList);
    }

    private static String getRandomNumber() {
        return Integer.toString((int) ((Math.random() * 9) + 1));
    }

    public String getComputerNumber() {
        return computerNumber;
    }
}
