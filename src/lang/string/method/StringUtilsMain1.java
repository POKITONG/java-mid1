package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);
        String boolString = String.valueOf(bool); //"true"
        System.out.println("불리언의 문자열 값: " + boolString);
        String objString = String.valueOf(obj); //null 이면 null 문자 반환, toString()화
        System.out.println("객체의 문자열 값: " + objString);

        //문자 + x -> 문자
        //자바에서 문자에 문자가 아닌 것을 담으면 문자가 되어버림.
        String numString2 = "" + num;
        System.out.println("빈 문자열 + num: " + numString2);

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        System.out.println(strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();

    }
}
