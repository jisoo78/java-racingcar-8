package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        List<String> carNames = InputCarName.getCarNames();
        int tryNumber = InputCarName.getTryCount();

        System.out.println("carName: " + carNames);
        System.out.println("tryNumber:" + tryNumber);

        System.out.println(RandomMoveNumber.carMove());

    }
}
