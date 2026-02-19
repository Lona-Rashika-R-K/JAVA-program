import java.util.*;
class Circ{
    double r,area;
     void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r:");
        r=sc.nextDouble();
    }
    void calci(){
        area=3.14*r*r;
        System.out.println("Area="+area);
    }
}
class defaul{
    public static void main(String[] args) {
        Circ obj=new Circ();
        obj.getdata();
        obj.calci();
    }
}
