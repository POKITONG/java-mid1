package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        // key에 해당하는 값을 찾지 못 하면 -1을 반환하기 때문에 while(index >= 0)이 된다.

        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }

        System.out.println("count = " + count);
    }
}
