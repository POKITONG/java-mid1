package lang.math.test;

public class MyLottoGeneratorMain {

    public static void main(String[] args) {
        MyLottoGenerator lottoGenerator = new MyLottoGenerator();
        int[] lottoNums = lottoGenerator.generate();

        System.out.print("로또 번호: ");
        for (int i : lottoNums) {
            System.out.print(i + " ");
        }

    }
}
