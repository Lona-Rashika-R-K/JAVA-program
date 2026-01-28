import java.util.Scanner;
public class octtobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        String oct = sc.next();
        String binary = "";
        for (int i = 0; i < oct.length(); i++) {
            char ch = oct.charAt(i);
            int value;
            value = ch - '0';
            String temp = "";
            for (int j = 0; j < 3; j++) {
                temp = (value % 2) + temp;
                value = value / 2;
            }
            binary = binary + temp;
        }
        System.out.println("Binary value: " + binary);
    }
}