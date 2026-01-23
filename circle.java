import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r=sc.nextDouble();
        double pi=3.14f;
        System.out.println(pi*r*r);
    }
}
