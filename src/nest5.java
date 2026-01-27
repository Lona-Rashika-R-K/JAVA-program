import java.util.Scanner;
public class nest5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,sum=0;
        a=sc.nextInt();
        for(int i=1;i<=a;i++) {
            int num=0;
            for (int j = 0; j <i; j++) {
                num=num*10;
                num=num+9;
            }
            sum=sum+num;
            System.out.println(sum);
        }
    }
}
