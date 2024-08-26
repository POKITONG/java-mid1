package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A"); //append : 뒤에다가 더함
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java"); //offset번쨰에 str을 넣음
        System.out.println("insert = "+ sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);

        //문자열을 변경하다가 나중에 변경할 기간이 끝나면 String으로 바꿔서 사용해서 사이드 이펙트를 방지한다.
    }
}
