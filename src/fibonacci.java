import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.println("Enter number:");
        n=sc.nextInt();
       for(int i=1;i<=n;i++){
//           System.out.print(a+" ");
          c=a+b;
           System.out.print(a+" ");
            a=b;
            b=c;
        }
    }
}
