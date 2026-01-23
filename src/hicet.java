import java.util.Scanner;
public class hicet {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students placed in CSE:");
        a=sc.nextInt();
        System.out.println("Enter the number of students placed in ECE:");
        b=sc.nextInt();
        System.out.println("Enter the number of students placed in MECH:");
        c=sc.nextInt();
        if((a<0) ||(b<0)||(c<0)){
            System.out.println("Invalid input");
        }
        else if((a==b)&&(b==c)){
            System.out.println("None of the department has highest placement");
        }
        else if((a>b)&&(a>c)){
            System.out.println("Highest Placement : CSE");
        }
        else if((b>a)&&(b>c)){
            System.out.println("Highest Placement :ECE");
        }
        else {
            System.out.println("Highest Placement : MECH");
        }
    }
}