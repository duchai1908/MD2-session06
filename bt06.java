package btsession06;

public class bt06 {
    public static void main(String[] args) {
        String productID = "[P\\w{4}]";
        String productName = "[w{6,50}]";
        String importPrice = "^[1-9]\\d*$";
        String status = "^(true|false)$";
    }
}
