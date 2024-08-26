package nested.anonymous.ex.ex1ref;

public class Sum implements Hello{
    @Override
    public void hello() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
    }
}
