import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter leap year:");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("Leap year"+year);
        }
        else{
            System.out.println("not a leap year"+year);
        }
    }
}
