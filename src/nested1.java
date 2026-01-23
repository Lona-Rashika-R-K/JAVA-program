import java.util.Scanner;
public class nested1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a + "a is greater");
            } else {
                System.out.println(c + "c is greater");
            }
        } else {
            if (b > c) {
                System.out.println(b + "b is greater");
            } else {
                System.out.println(c + "c is greater");
            }
        }
    }
}
