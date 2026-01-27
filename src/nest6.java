import java.util.Scanner;
public class nest6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        for(int i=1;i<=a;i++) {
            for(int j=1;j<=1;j++){
                System.out.print(' ');
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print('*');
            }
            System.out.println(' ');
        }
    }
}
