import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        int  units;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Units:");
        units = sc.nextInt();
        if (units <= 100) {
            System.out.println("Charges:"+units);
        }
        else if ((units >= 100)&&(units<=200)){
            System.out.println("Charges :"+units*2);
        }
        else if ((units >= 201)&&(units<=300)) {
            System.out.println("Charges :"+units*3);
        }
        else if (units > 300) {
            System.out.println("Charges :"+units*5);
        }
        else{
            System.out.println("No charges");
        }
    }
}