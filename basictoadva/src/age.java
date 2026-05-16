import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        if((age>=1)&&(age<=12)){
            System.out.println("Child");
        }
        else if ((age>=13)&&(age<=19)) {
            System.out.println("Teenage");
        }
        else{
            System.out.println("Adult");
        }
    }
}
