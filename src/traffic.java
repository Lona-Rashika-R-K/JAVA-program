import java.util.Scanner;
public class traffic {
    public static void main(String[] args) {
        int speed;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Speed:");
        speed= sc.nextInt();
        if(speed<=60){
            System.out.println("No Fine");
        }
        else if((speed>=61)&&(speed<=80)){
            System.out.println("500rs Fine");
        }
        else if((speed>80)&&(speed<=100)){
            System.out.println("2000rs Fine");
        }
        else if((speed>=101)&&(speed<=120)){
            System.out.println("5000rs Fine");
        }
        else if(speed>120){
            System.out.println("License Suspended");
        }
    }
}
