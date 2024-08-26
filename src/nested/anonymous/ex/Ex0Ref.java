package nested.anonymous.ex;

public class Ex0Ref {

    public static void hello(String string) {
        System.out.println("프로그램 시작");
        System.out.println("Hello " + string);
        System.out.println("프로그램 종료");
    }



    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}
