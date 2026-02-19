import java.util.*;
class spiralrotation{
    public static void main(String[] args) {
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r:");
        r = sc.nextInt();
        System.out.println("Enter c:");
        c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral rotation");
        for(int i=0;i<r;i++){
            for(int j=r-1;j>=0;j--){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}