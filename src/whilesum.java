import java.util.Scanner;
public class whilesum {
    public static void main(String[] args) {
        int n,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
