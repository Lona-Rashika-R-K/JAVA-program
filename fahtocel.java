import java.util.Scanner;
public class fahtocel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenhiet:");
        double F = sc.nextDouble();
        double C=(F-32)/5/9;
        System.out.println("Celsius"+C+"C");
    }
}
