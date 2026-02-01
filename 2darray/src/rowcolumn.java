import java.util.Scanner;
public class rowcolumn {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r:");
        r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            System.out.println("Enter c:");
            c = sc.nextInt();
            a[i] = new int[c];
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
}