import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        int lastDigits = square % (int) Math.pow(10, count);
        if (lastDigits == num)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}
