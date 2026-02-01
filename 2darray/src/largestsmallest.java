import java.util.Scanner;
public class largestsmallest{
    public static void main(String[] args) {
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r:");
        r = sc.nextInt();
        System.out.println("Enter c:");
        c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int largest = a[0][0];
        int smallest = a[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                }
                else if (a[i][j]<smallest){
                    smallest = a[i][j];
                }
            }
        }
        System.out.println("Largest element:"+largest);
        System.out.println("Smallest element:"+smallest);
    }
}

