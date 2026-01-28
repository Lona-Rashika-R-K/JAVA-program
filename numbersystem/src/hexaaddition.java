import java.util.Scanner;
public class hexaaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first hexadecimal number: ");
        String h1 = sc.next().toUpperCase();
        System.out.print("Enter second hexadecimal number: ");
        String h2 = sc.next().toUpperCase();
        int i = h1.length() - 1;
        int j = h2.length() - 1;
        int carry = 0;
        String sum = "";
        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = 0, d2 = 0;
            if (i >= 0) {
                char c1 = h1.charAt(i);
                d1 = (c1 >= '0' && c1 <= '9') ? c1 - '0' : c1 - 'A' + 10;
                i--;
            }
            if (j >= 0) {
                char c2 = h2.charAt(j);
                d2 = (c2 >= '0' && c2 <= '9') ? c2 - '0' : c2 - 'A' + 10;
                j--;
            }
            int temp = d1 + d2 + carry;
            carry = temp / 16;
            temp = temp % 16;
            if (temp < 10)
                sum = temp + sum;
            else
                sum = (char)(temp - 10 + 'A') + sum;
        }
        System.out.println("Hexadecimal Sum = " + sum);
    }
}