import java.util.Scanner;
public class OctalAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first octal number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second octal number: ");
        int n2 = sc.nextInt();
        int carry = 0, sum = 0, place = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int temp = d1 + d2 + carry;
            carry = temp / 8;
            temp = temp % 8;
            sum = sum + temp * place;
            place = place * 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        System.out.println("Octal Sum = " + sum);
    }
}