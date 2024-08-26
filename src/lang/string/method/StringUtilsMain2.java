package lang.string.method;

public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format 메서드
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println("format1 = " + format1);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        // pritnf
        System.out.printf("숫자: %.2f\n", 10.1234);

        // matches 메서드
        // "Hello, Java!"
        String regex = "Hello, (Java!|World)";
        // 주어진 str이 Hello, 로 시작하고 그 뒤가 Java! 혹은 World가 들어오는지 확인
        System.out.println("'str'이 패턴과 일치하는가?" + str.matches(regex));
        // 정규표현식은 필요하면 따로 공부하면 되고, 외우지 말고 그 때 그 떄 찾아보면 된다.

    }
}
