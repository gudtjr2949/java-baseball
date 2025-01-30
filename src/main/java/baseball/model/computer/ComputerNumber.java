package baseball.model.computer;

import java.util.*;

public class ComputerNumber {

    private String computerNumber;
    private final static int NUMBER_LENGTH = 3;


    public ComputerNumber() {
        this.computerNumber = setComputerNumber();
    }

    /**
     * 난수 생성 -> 겹치는 숫자가 없어야 함
     *
     */
    public String setComputerNumber() {
        List<String> randomList = new ArrayList<>();
        Set<Integer> uniqueNumbers = new HashSet<>();

        Random random = new Random();

        while (randomList.size() < NUMBER_LENGTH) {
            int randomNum = random.nextInt(9) + 1;
            checkRandomInt(randomList, uniqueNumbers, randomNum);
        }

        return String.join("", randomList);
    }

    private static void checkRandomInt(List<String> randomList, Set<Integer> uniqueNumbers, int randomNum) {
        if (!uniqueNumbers.contains(randomNum)) {
            uniqueNumbers.add(randomNum);
            randomList.add(String.valueOf(randomNum));
        }
    }

    public String getComputerNumber() {
        return computerNumber;
    }
}
