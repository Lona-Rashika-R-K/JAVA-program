import java.util.Scanner;
class sum{
    public static void main(String[] args) {
        double pi=3.14;
        System.out.println("enter radius:");
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double area;
        area=pi*radius*radius;
        System.out.println(area);
    }
}