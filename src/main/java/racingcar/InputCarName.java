package racingcar;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputCarName {

    public static List<String> getCarNames() {
        System.out.println("경주에 참여할 자동차 이름을 입력하세요(자동차 이름은 5글자 이내, 쉼표로 구분합니다)");
        String inputCarName = Console.readLine();

        List<String> carNames = new ArrayList<>();
        for (String name : inputCarName.split(",")) {
            name = name.trim();
            if (name.isEmpty() || name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 1~5자 이내로 작성해야합니다.");
            }
            carNames.add(name);
        }
        return carNames;
    }

    public static int getTryCount() {
        System.out.println("시도할 횟수 입력");
        String tryNumber = Console.readLine();

        try {
            int count = Integer.parseInt(tryNumber);
            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1 이상 입력해야합니다.");
            }
            return count;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력하세요.");
        }
    }
}
