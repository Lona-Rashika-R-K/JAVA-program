import java.util.Scanner;
public class celtofah {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celsius:");
        double celsius=sc.nextDouble();
        double fahrenhiet=celsius*9/5+32;
        System.out.println("Fahrenhiet:"+fahrenhiet+"F");

}
}
