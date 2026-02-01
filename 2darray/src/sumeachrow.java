import java.util.Scanner;
public class sumeachrow {
    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r:");
        r=sc.nextInt();
        System.out.println("Enter c:");
        c=sc.nextInt();
        int[][] a=new int[r][c];
        int sum=0;
        System.out.println("Enter 1st matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            sum=0;
            for (int j = 0; j < c; j++) {
                sum = sum + a[j][i];
            }
            System.out.println("Sum" + sum);
        }
    }
}

