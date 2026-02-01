import java.util.Scanner;
public class longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        int len=0,l=0,sum=0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j <n; j++) {
                sum = sum + arr[j];
//                if(sum>=k)
                    if (sum == k)
                        l = j - i + 1;
//                if(l>len)
//                        len=l;
            }
        }
        System.out.println("Length of largest subarray: " + l);
    }
}
