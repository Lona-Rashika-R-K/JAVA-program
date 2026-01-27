import java.util.Scanner;
public class continue1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0)
                continue;
            else
                System.out.println(i);
        }
    }
}
