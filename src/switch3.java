import java.util.Scanner;
public class switch3 {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day :");
        day=sc.nextInt();
        switch(day){
            case 100+2:
                System.out.println("Monday");
                break;
            case 200*2:
                System.out.println("Tuesday");
                break;
            case 700+100:
                System.out.println("Thursday");
                break;
            case 600*2:
                System.out.println("Saturday");
                break;
            case 300*2:
                System.out.println("Wednesday");
                break;
            case 100*10:
                System.out.println("Friday");
                break;
            case 1000+400:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
