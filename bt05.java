package btsession06;

public class bt05 {
    public static void main(String[] args) {
        String productIdregex = "[[CSA]\\w{3}]";
        String productNameregex = "[\\w{6,50}]";
        String dateTimeRegex = "^\\d{2}/\\d{2}/\\d{4}$";
        String productStatusRegex = "[012]";
    }
}
