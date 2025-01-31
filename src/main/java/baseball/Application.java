package baseball;

import baseball.controller.BaseballGameController;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {

    // TODO: Main 에서 너무 많은 역할 담당
    public static void main(String[] args) {
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
