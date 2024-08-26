package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        // _는 자바에서 지원하는 표기법으로, 큰 수일 경우 가시성이 떨어지기 때문에 가시성을 높이기 위해 사용할 수 있다.
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");

        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");
    }
}
