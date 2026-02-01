import java.util.Scanner;
public class matrixmultiply {
    public static void main(String[] args) {
        int r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r1:");
        r1=sc.nextInt();
        System.out.println("Enter c1:");
        c1=sc.nextInt();
        System.out.println("Enter r2:");
        r2=sc.nextInt();
        System.out.println("Enter c2:");
        c2=sc.nextInt();
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        int[][] multiply=new int[r1][c2];
        System.out.println("Enter 1st matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix multiplication");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    multiply[i][j]=multiply[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(multiply[i][j]+" ");
            }
            System.out.println();
        }
    }
}

