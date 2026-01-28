import java.util.Scanner;
public class hexatobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hexadecimal number: ");
        String hex = sc.next().toUpperCase();
        String binary = "";
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9')
                value = ch - '0';
            else
                value = ch - 'A' + 10;
            String temp = "";
            for (int j = 0; j < 4; j++) {
                temp = (value % 2) + temp;
                value = value / 2;
            }
            binary = binary + temp;
        }
        System.out.println("Binary value: " + binary);
    }
}