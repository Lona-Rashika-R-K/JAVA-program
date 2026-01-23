import java.util.Scanner;
public class pizza {
    public static void main(String[] args) {
        int a, b, c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pizza bought:");
        a = sc.nextInt();
        System.out.println("Enter the number of puffs bought:");
        b = sc.nextInt();
        System.out.println("Enter the number of cooldrinks bought:");
        c = sc.nextInt();
        System.out.println("Bill details");
        System.out.println("No of pizzas"+a);
        System.out.println("No of puffs:"+b);
        System.out.println("No of cooldrinks"+c);
        d=a*100+b*20+c*10;
        System.out.println("Total price:"+d);

    }
}
