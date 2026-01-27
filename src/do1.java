import java.util.Scanner;
public class do1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       int i=2;
       do{
           System.out.println(i);
           i+=2;
       }
       while(i<=n);
    }
}
