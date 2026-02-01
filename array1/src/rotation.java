//import java.util.Scanner;
//
//public class rotation {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        int[] b = new int[n];
//        System.out.println("Enter elements of first array:");
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Enter elements of second array:");
//        for (int i = 0; i < n; i++) {
//            b[i] = sc.nextInt();
//        }
//        boolean isRotation = false;
//        for (int i = 0; i < n; i++) {
//            if (a[i] == b[0]) {
//                int j;
//                for (j = 0; j < n; j++) {
//                    if (a[(i + j) % n] != b[j])
//                        break;
//                }
//                if (j == n) {
//                    isRotation = true;
//                    break;
//                }
//            }
//        }
//        if (isRotation)
//            System.out.println("Second array is a rotation of first array");
//        else
//            System.out.println("Second array is NOT a rotation of first array");
//    }
//}


import java.util.Scanner;
public class rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter second array:");
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();
        boolean isRotation = false;
        for (int r = 0; r < n; r++) {
            int j;
            for (j = 0; j < n; j++) {
                if (a[j] != b[j])
                    break;
            }
            if (j == n) {
                isRotation = true;
                break;
            }
            int temp = a[0];
            for (int i = 0; i < n - 1; i++)
                a[i] = a[i + 1];
            a[n - 1] = temp;
        }
        if (isRotation)
            System.out.println("Second array is a rotation of first array");
        else
            System.out.println("Second array is NOT a rotation of first array");
    }
}
