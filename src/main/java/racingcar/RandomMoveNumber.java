package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMoveNumber {
    public static boolean carMove() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }
}
