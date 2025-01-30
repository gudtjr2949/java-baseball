package baseball;

import baseball.controller.BaseballGameController;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        OutputView.printStartGame();
        do {
            BaseballGameController controller = new BaseballGameController();
            controller.start();
        } while (setRetryNumber());
    }

    private static boolean setRetryNumber() {
        String retry = InputView.setRetryNumber();
        if (retry.equals("1")) return true;
        return false;
    }
}
