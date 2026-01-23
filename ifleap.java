import java.util.Scanner;
public class ifleap {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        year = sc.nextInt();
        if((year%4==0)&&(year%400!=0)||(year!=100)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}