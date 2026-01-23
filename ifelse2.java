import java.util.Scanner;
public class ifelse2 {
    public static void main(String[] args) {
        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark:");
        mark = sc.nextInt();
        if(mark>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
