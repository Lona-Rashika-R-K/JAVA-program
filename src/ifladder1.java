import java.util.Scanner;
public class ifladder1 {
    public static void main(String[] args) {
        int per,atten;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter percentage:");
        System.out.println("Enter attendance:");
        per=sc.nextInt();
        atten=sc.nextInt();
        if((per>=85)&&(atten>=90)){
            System.out.println("Distinction");
        }
        else if((per>=70)&&(atten>=80)){
            System.out.println("First Class");
        }
        else if((per>=60)&&(atten>=75)){
            System.out.println("Second Class");
        }
        else if((per>=50)&&(atten>=75)){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
