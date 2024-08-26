package lang.math.test;

public class GPTLottoGeneratorMain {

    public static void main(String[] args) {
        GPTLottoGenerator generator = new GPTLottoGenerator();
        int[] lottoNums = generator.generate();
        for (int num : lottoNums) {
            System.out.print(num + " ");
        }
    }

}
