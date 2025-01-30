package baseball.view;


import camp.nextstep.edu.missionutils.Console;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

    public static String setPlayerNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        return scanner.nextLine();
    }

    public static String setRetryNumber() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return scanner.nextLine();
    }
}
