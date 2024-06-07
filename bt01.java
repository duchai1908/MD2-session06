package btsession06;

import java.util.Arrays;

public class bt01 {
    public static void main(String[] args) {
        String str1 = "  Rikkei Academy  ";
        String str2 = "Rikkei Academy";
        String str3 = "riKKei AcadEMy";
        System.out.println("Kiểm tra 1 chuỗi có rỗng hay k "+str1.isEmpty());
        System.out.println("Loại bỏ khoảng trắng 2 đầu "+str1.trim());
        System.out.println("Kiểm tra 2 chuỗi có gióng nhau: "+ str2.equalsIgnoreCase(str3));
        System.out.println("Kiểm tra 2 chuỗi có gióng nhau: "+ str2.equals(str3));
        String[] arr1 = str1.split(" ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Nối 2 chuỗi "+str1.concat(str2));
        System.out.println("Kiểm tra chuỗi có chứa hay k"+ str1.contains(str2));

    }
}
