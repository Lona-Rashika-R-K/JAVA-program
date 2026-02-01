import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={10,20,30,40,50};
        int search=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==search) {
                System.out.println("Element found");
                break;
            }
            else{
                System.out.println("Element not found");
                break;
            }
        }
    }
}
