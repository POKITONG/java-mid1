package nested.anonymous.ex.ex1ref;

public class Ex1Main {

    public static void hello(Hello param) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        param.hello();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Hello dice = new Dice();
        Hello sum = new Sum();
        hello(dice);
        hello(sum);
    }
}
