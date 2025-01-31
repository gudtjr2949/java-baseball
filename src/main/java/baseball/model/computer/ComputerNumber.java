package baseball.model.computer;

import java.util.*;

import static baseball.util.GameConstant.*;

public class ComputerNumber {

    private String computerNumber;

    /**
     * Random 객체 사용 목적은 오로지 난수 생성임 (아직은..)
     * 그렇기 때문에 클래스 멤버로 선언함
     */
    private static final Random random = new Random();


    public ComputerNumber() {
        this.computerNumber = setComputerNumber();
    }

    public String setComputerNumber() {
        List<String> randomList = new ArrayList<>();

        while (randomList.size() < BASEBALL_LENGTH) {
            int randomNum = random.nextInt(BASEBALL_END) + BASEBALL_START;
            checkRandomInt(randomList, randomNum);
        }

        return String.join("", randomList);
    }

    private static void checkRandomInt(List<String> randomList, int randomNum) {
        if (!randomList.contains(randomNum)) {
            randomList.add(String.valueOf(randomNum));
        }
    }

    public String getComputerNumber() {
        return computerNumber;
    }
}
