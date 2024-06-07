package btsession06;

public class bt02 {
    public static void main(String[] args) {
            String str = "ABC";
            StringBuilder str1 = new StringBuilder("BNM LMK");
            StringBuilder str2 = new StringBuilder();
            //append
        System.out.println("Append: "+str1.append(str));
            //insert
        str1.insert(2, "XYZ");
            //replace
        str1.replace(2,5,"OK");
            //delete
        str1.delete(1,4);
            //length
        System.out.println("Lenght: " + str1.length());
            //reverse
        str1.reverse();

    }
}
