import java.util.Scanner;
public class switch2{
    public static void main(String[] args) {
        char day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day :");
        day=sc.nextLine().charAt(0);
        switch(day)
        {
            case 'a':
                System.out.println("Monday");
                break;
            case 'b':
                System.out.println("Tuesday");
                break;
            case 'd':
                System.out.println("Thursday");
                break;
            case 'f':
                System.out.println("Saturday");
                break;
            case 'c':
                System.out.println("Wednesday");
                break;
            case 'e':
                System.out.println("Friday");
                break;
            case 'g':
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

