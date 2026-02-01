import java.util.Scanner;
public class arr1 {
    public static void main(String[] args) {
        int n;
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
        System.out.println("\n Array Element\n");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
