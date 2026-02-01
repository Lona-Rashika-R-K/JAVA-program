import java.util.Scanner;
public class rowwithsum{
    public static void main(String[] args) {
        int r,c;
        int maxSum=0;
        int row=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r:");
        r=sc.nextInt();
        System.out.println("Enter c:");
        c=sc.nextInt();
        int[][] a=new int[r][c];
        int sum=0;
        System.out.println("Enter 1st matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            sum=0;
            for (int j = 0; j < c; j++) {
                sum = sum + a[i][j];
            }
            if(sum>maxSum){
                maxSum = sum;
                row=i;
            }
        }
        System.out.println("Max with row"+(row+1));
        System.out.println("MasSum"+maxSum);
    }
}


