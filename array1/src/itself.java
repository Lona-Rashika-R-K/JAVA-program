//import java.util.Scanner;
//public class itself {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        int[] result = new int[n];
//
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            result[i] = 1;
//        }
//        int left = 1;
//        for (int i = 0; i < n; i++) {
//            result[i] = left;
//            left = left * arr[i];
//        }
//        int right = 1;
//        for (int i = n - 1; i >= 0; i--) {
//            result[i] = result[i] * right;
//            right = right * arr[i];
//        }
//        System.out.println("Product array:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(result[i] + " ");
//        }
//    }
//}
import java.util.Scanner;
public class itself{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            res[i] = 1;
        }
        int left = 1, right = 1;
        for (int i = 0; i < n; i++) {
            res[i] = res[i] * left;
            left = left * arr[i];
            res[n - 1 - i] = res[n - 1 - i] * right;
            right = right * arr[n - 1 - i];
        }
        System.out.println("Product array:");
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
