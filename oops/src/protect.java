import java.util.*;
class Cir{
    double r,area;
    protected void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r:");
        r=sc.nextDouble();
    }
    protected void calci(){
        area=3.14*r*r;
        System.out.println("Area="+area);
    }
}
class protect{
    public static void main(String[] args) {
        Cir obj=new Cir();
        obj.getdata();
        obj.calci();
    }
}
