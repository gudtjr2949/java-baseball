package baseball.view;

public class OutputView {
    public static void printStartGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printBall(int ball) {
        System.out.print(ball + "볼 ");
    }

    public static void printOnlyBall(int ball) {
        System.out.println(ball + "볼");
    }

    public static void printStrike(int strike) {
        System.out.println(strike + "스트라이크");
    }

    public static void printNotting() {
        System.out.println("낫싱");
    }

    public static void printPlayerNumber() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printRetryNumber() {System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. ");}

    // TODO : 리팩토링 필요
    public static void printCount(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            printNotting();
        } else if (strike == 0) {
            printOnlyBall(ball);
        } else if (ball == 0) {
            printStrike(strike);
        } else {
            printBall(ball);
            printStrike(strike);
        }
    }

    public static void printGameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}