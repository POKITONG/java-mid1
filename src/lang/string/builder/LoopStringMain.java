package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //현재 미리세컨트 시간을 뽑아줌

        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java";
        }
        long endTIme = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTIme - startTime) + "ms");
    }
}
