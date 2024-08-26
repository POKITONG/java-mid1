package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@exmaple.com";
        String[] parts = email.split("@");
        String idPart = parts[0];
        String emailPart = parts[1];

        System.out.println("ID:" + idPart);
        System.out.println("Domain:" + emailPart);
    }
}
