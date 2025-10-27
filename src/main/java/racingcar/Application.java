package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("경주에 참여할 자동차 이름을 입력하세요(자동차 이름은 5글자 이내, 쉼표로 구분합니다)");
        String carName = Console.readLine();
        System.out.println("carName: " + carName);

        System.out.println("시도할 횟수 입력");
        String tryNumber = Console.readLine();
        System.out.println("tryNumber: " + tryNumber);

        System.out.println(RandomMoveNumber.carMove());

    }
}
