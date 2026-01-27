import java.util.Scanner;
import java.lang.Math;
public class armstrong  {
    public static void main(String[] args) {
        int sum=0,rem,digits=0,n,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits");
        n= sc.nextInt();
        temp=n;
        while(temp!=0){
            temp=temp/10;
            digits++;
        }
        System.out.println(digits);
        temp=n;
        while(temp!=0){
            rem=temp%10;
            sum+=Math.pow(rem,digits);
            temp=temp/10;
        }
       if(sum==n){
           System.out.println("Armstrong Number");
       }
       else{
           System.out.println("Not an Armstrong Number");
       }
    }
}