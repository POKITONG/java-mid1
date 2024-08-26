package lang.math.test;

import java.util.Random;

public class MyLottoGenerator {

    private final Random RANDOM = new Random();
    private int[] lottoNums = new int[6];
    private int count;

    public int[] generate() {
        // num1을 하나 뽑고, num2를 뽑아서 둘을 비교
        // num1과 num2가 일치하지 않으면 배열에 num1을 넣고 카운트를 증가시킴
        // num1과 num2가 일치하면 num2를 다시 하나 뽑고, 카운트는 증가시키지 않음
        // 그렇게 카운트가 6이 되면 종료하고 배열을 리턴

        int num1 = RANDOM.nextInt(45) + 1;

        for (count = 0; count < lottoNums.length; ) {
            int num2 = RANDOM.nextInt(45) + 1;
            if (num1 != num2) {
                lottoNums[count] = num1;
                num1 = num2;
                count++;
            }
        }

        return lottoNums;
    }

}
