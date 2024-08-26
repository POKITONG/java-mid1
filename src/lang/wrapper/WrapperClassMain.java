package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신 valueOf()를 사용
        // @Deprecated 는 곧 삭제될 메서드를 의미
        Integer integerObject = Integer.valueOf(10); // -128~ 127 자주 사용하는 숫자 값 재사용, 불변
        // 성능, 메모리 최적화가 더 잘되고 문자열 풀처럼 미리 만들어놓은 것을 가져오기 때문에 더 빠르다.
        Long longOb = Long.valueOf(100);
        Double doubleOb = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObject = " + integerObject);
        System.out.println("longOb = " + longOb);
        System.out.println("doubleOb = " + doubleOb);

        System.out.println("내부 값 읽기");
        int intValue = integerObject.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longOb.longValue();
        System.out.println("longValue = " + longValue);
        double doubleValue = doubleOb.doubleValue();
        System.out.println("doubleValue = " + doubleValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObject));
        System.out.println("equals: " + (newInteger.equals(integerObject)));

    }
}
