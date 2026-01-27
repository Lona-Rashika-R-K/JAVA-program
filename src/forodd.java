import java.util.Scanner;
public class forodd {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i+=2){
            System.out.println("odd number:"+i);
        }
    }
}
