package racingcar;

import java.util.*;

public class RacingGame {

    public static void racingGame(List<String> carNames, int tryNumber) {
        Map<String, Integer> carPositions = new HashMap<>();

        for (String name : carNames) {
            carPositions.put(name, 0);
        }

        System.out.println("실행 결과");

        for (int attempt = 0; attempt < tryNumber; attempt++) {
            moveCars(carNames, carPositions);
            System.out.println();
        }

        Winners(carPositions);
    }

    private static void moveCars(List<String> carNames, Map<String, Integer> carPositions) {
        for (String name : carNames) {
            movePositions(name, carPositions);
            System.out.println(name + " : " + "-".repeat(carPositions.get(name)));
        }
    }

    private static void movePositions(String name, Map<String, Integer> carPositions) {
        if (RandomMoveNumber.carMove()) {
            carPositions.put(name, carPositions.get(name) + 1);
        }
    }

    private static void Winners(Map<String, Integer> carPositions) {
        int max = Collections.max(carPositions.values());
        List<String> winners = new ArrayList<>();

        for (String name : carPositions.keySet()) {
            if (carPositions.get(name) == max) {
                winners.add(name);
            }
        }

        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
