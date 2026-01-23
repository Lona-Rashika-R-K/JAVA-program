import java.util.Scanner;
public class month {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter Month:"));
        month=sc.nextInt();
        if((month<1)||(month>12)){
            System.out.println("Invalid Month");
        }
        else if((month>=3)&&(month<=5)){
            System.out.println("Spring");
        }
        else if((month>=6)&&(month<=8)){
            System.out.println("Summer");
        }
        else if((month>=9)&&(month<=11)){
            System.out.println("Autumn");
        }
        else{
            System.out.println("Winter");
        }
    }
}
