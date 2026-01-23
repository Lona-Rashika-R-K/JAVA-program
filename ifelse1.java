import java.util.Scanner;
public class ifelse1 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        a=sc.nextInt();
        if((a%5==0)&&(a%7==0)) {
            System.out.println(a + " divisible by 5&7");
        }
        else {
            System.out.println(a + " may not be divisible by 5&7");
        }
    }
}
