import java.util.Scanner;
public class matrixadd {
    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r:");
        r=sc.nextInt();
        System.out.println("Enter c:");
        c=sc.nextInt();
        int[][] a=new int[r][c];
        int[][] b=new int[r][c];
        int[][] sum=new int[r][c];
        System.out.println("Enter 1st matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix addition");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}

