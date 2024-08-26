package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String string = child.toString();
        //toString - 객체의 정보를 제공
        System.out.println(string);
    }
}
