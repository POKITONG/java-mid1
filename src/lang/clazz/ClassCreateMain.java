package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        // Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        // 헬로클래스가 가진 선택해서 객체를 생성
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
