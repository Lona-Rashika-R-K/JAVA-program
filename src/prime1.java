import java.util.Scanner;
public class prime1 {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                System.out.println(i);
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }

    }
}

