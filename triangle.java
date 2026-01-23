import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("Enter three number:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = a + b + c;
        System.out.println("Perimeter of a triangle:" + d);
    }
}
