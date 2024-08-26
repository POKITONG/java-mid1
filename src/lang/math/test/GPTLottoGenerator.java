package lang.math.test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GPTLottoGenerator {

    private final Random RANDOM = new Random();
    private static final int LOTTO_SIZE = 6;
    private static final int MAX_NUMBER = 45;

    public int[] generate() {
        Set<Integer> lottoNumsSet = new HashSet<>();
        while (lottoNumsSet.size() < LOTTO_SIZE) {
            int num = RANDOM.nextInt(MAX_NUMBER) + 1;
            lottoNumsSet.add(num);
        }

        int[] lottoNums = new int[LOTTO_SIZE];
        int i = 0;
        for (Integer num : lottoNumsSet) {
            lottoNums[i++] = num;
        }

        return lottoNums;

    }
}
