import java.util.Scanner;
public class break1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==3)
                break;
            else
                System.out.println(i);
        }
    }
}
