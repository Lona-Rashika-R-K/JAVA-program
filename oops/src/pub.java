import java.util.*;
class Circle{
    double r,area;
    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r:");
        r=sc.nextDouble();
    }
    public void calci(){
        area=3.14*r*r;
        System.out.println("Area="+area);
    }
}
class pub {
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.getdata();
        obj.calci();
    }
}
