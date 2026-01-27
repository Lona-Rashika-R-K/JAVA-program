import java.util.Scanner;
public class arm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num= sc.nextInt();
        int original=num,sum=0,digit;
        while(num!=0){
            digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if(original==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
}

