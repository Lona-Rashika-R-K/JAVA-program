import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r:");
        r = sc.nextInt();
        System.out.println("Enter c:");
        c = sc.nextInt();
        int[][] a = new int[r][c];
        r = a.length;
        c = a[0].length;
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}

