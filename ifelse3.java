import java.util.Scanner;
public class ifelse3{
    public static void main(String[] args) {
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount:");
        amount = sc.nextInt();
        if(amount>10000){
            System.out.println("Debit 500");
        }
        else{
            System.out.println("Debit 50");
        }
    }
}
