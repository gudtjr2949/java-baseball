package baseball;

import baseball.controller.BaseballGameController;
import baseball.model.player.PlayerNumber;
import baseball.model.player.PlayerRetryNumber;
import baseball.util.PlayerConstant;
import baseball.view.InputView;
import baseball.view.OutputView;

import static baseball.util.PlayerConstant.*;

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
        PlayerRetryNumber playerRetryNumber = new PlayerRetryNumber(InputView.setRetryNumber());
        return playerRetryNumber.getPlayerRetryNumbers().equals(BASEBALL_GAME_RESTART);
    }
}
