package baseball.controller;

import baseball.model.computer.ComputerNumber;
import baseball.model.player.PlayerNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

import static baseball.util.GameConstant.BASEBALL_LENGTH;

/**
 * TODO : 리팩토링 필요. Controller 에서 너무 많은 역할 수행. 메서드 명도 너무 헷갈림
 *
 */
public class BaseballGameController {

    public void start() {
        ComputerNumber computerNumber = new ComputerNumber();
        int ball = 0;
        int strike = 0;

        do {
            PlayerNumber playerNumber = new PlayerNumber(InputView.setPlayerNumber());
            strike = calculateStrike(computerNumber, playerNumber);
            ball = calculateBall(computerNumber, playerNumber) - strike;
        } while (checkEndOrContinue(ball, strike));
    }

    private int calculateStrike(ComputerNumber computerNumber, PlayerNumber playerNumber) {
        int strike = 0;

        for (int i = 0; i < BASEBALL_LENGTH; i++) {
            strike += getStrike(computerNumber, playerNumber, i);
        }

        return strike;
    }


    private int calculateBall(ComputerNumber computerNumber, PlayerNumber playerNumber) {
        int ball = 0;

        for (int i = 0; i < BASEBALL_LENGTH; i++) {
            ball += getBall(playerNumber.getPlayerNumbers(), computerNumber.getComputerNumber(), i);
        }

        return ball;
    }

    private static int getStrike(ComputerNumber computerNumber, PlayerNumber playerNumber, int idx) {
        if (computerNumber.getComputerNumber().charAt(idx) == playerNumber.getPlayerNumbers().charAt(idx)) return 1;
        return 0;
    }


    private static int getBall(String player, String computer, int i) {
        if (computer.contains(Character.toString(player.charAt(i)))) return 1;
        return 0;
    }

    private boolean checkEndOrContinue(int ball, int strike) {
        OutputView.printCount(ball, strike);

        if (strike == BASEBALL_LENGTH) {
            OutputView.printGameEnd();
            return false;
        }

        return true;
    }
}
