package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(3, "Java")
                .delete(4, 8)
                .reverse()
                .toString();


        System.out.println("string = " + string);

        //문자열을 변경하다가 나중에 변경할 기간이 끝나면 String으로 바꿔서 사용해서 사이드 이펙트를 방지한다.
    }
}
