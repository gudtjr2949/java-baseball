package baseball.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

    public static String setPlayerNumber() {
        OutputView.printPlayerNumber();
        return scanner.nextLine();
    }

    public static String setRetryNumber() {
        OutputView.printRetryNumber();
        return scanner.nextLine();
    }
}
