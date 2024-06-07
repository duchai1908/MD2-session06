package btsession06;

import java.util.regex.Pattern;

public class bt03 {
    public static void main(String[] args) {
        String emailRegex = "[a-z]+@[a-z]+\\.[a-z]+";
        String email = "duchai@gmail.com";
        System.out.println("email regex: " + Pattern.matches(emailRegex, email));
    }
}
