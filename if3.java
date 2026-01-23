import java.util.Scanner;
public class if3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number:");
        num = sc.nextInt();
        if(num%17==0)
            System.out.println("Divisible by 17");
    }
}