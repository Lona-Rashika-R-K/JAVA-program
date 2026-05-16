import java.util.Scanner;
public class numberpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stars:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
