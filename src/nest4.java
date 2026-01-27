import java.util.Scanner;
public class nest4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        for(int i=1;i<=a;i++) {
            int j;
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(i+1+" ");
        }
    }
}
