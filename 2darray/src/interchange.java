import java.util.Scanner;
public class interchange {
    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r:");
        r=sc.nextInt();
        System.out.println("Enter c:");
        c=sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
            for (int j = 0; j < c; j++) {
                int temp=a[0][j];
                a[0][j]=a[r-1][j];
                a[r-1][j]=temp;
            }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

