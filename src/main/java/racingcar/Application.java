package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        List<String> carNames = InputCarName.getCarNames();
        int tryNumber = InputCarName.getTryCount();

        RacingGame.racingGame(carNames, tryNumber);
    }
}
