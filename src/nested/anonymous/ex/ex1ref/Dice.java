package nested.anonymous.ex.ex1ref;

import java.util.Random;

public class Dice implements Hello {
    @Override
    public void hello() {
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);
    }
}
