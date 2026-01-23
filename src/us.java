import java.util.Scanner;
public class us {
    public static void main(String[] args) {
        double litres,distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of litres to fill the tank:");
        litres= sc.nextDouble();
        System.out.println("Enter the distance covered");
        distance = sc.nextDouble();
        if((litres<=0)||(distance<=0)) {
            System.out.println("Invalid Input");
        }
        else{
            double litresper100km=(litres/distance)*100;
            double miles=distance*0.2642;
            double gallons=litres*0.6214;
            double milespergallon=miles/gallons;
            System.out.println("(Litres/100KM)");
            System.out.println(litresper100km);
            System.out.println("(Miles/gallons)");
        }
    }
}
