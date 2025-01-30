package baseball.controller;

import baseball.model.computer.ComputerNumber;
import baseball.model.player.PlayerNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {
    private static final int NUMBER_LENGTH = 3;

    public void start() {
        ComputerNumber computerNumber = new ComputerNumber();
        int ball = 0;
        int strike = 0;
        do {
            PlayerNumber playerNumber = new PlayerNumber(InputView.setPlayerNumber());
            strike = setStrike(playerNumber.getPlayerNumbers(), computerNumber.getComputerNumber());
            ball = setBall(playerNumber.getPlayerNumbers(), computerNumber.getComputerNumber()) - strike;
        } while (checkEndOrContinue(ball, strike));
    }

    private boolean checkEndOrContinue(int ball, int strike) {
        OutputView.printCount(ball, strike);

        if (strike == NUMBER_LENGTH) {
            OutputView.printGameEnd();
            return false;
        }

        return true;
    }

    private int setBall(String player, String computer) {
        int ball = 0;

        for (int i = 0 ; i < NUMBER_LENGTH ; i++) {
            ball += getBall(player, computer, i);
        }

        return ball;
    }

    private static int getBall(String player, String computer, int i) {
        if (computer.contains(Character.toString(player.charAt(i)))) return 1;
        return 0;
    }


    private int setStrike(String player, String computer) {
        int strike = 0;

        if (player.charAt(0) == computer.charAt(0)) strike++;
        if (player.charAt(1) == computer.charAt(1)) strike++;
        if (player.charAt(2) == computer.charAt(2)) strike++;

        return strike;
    }
}
