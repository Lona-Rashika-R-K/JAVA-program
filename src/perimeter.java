class Area {
    double r;
    public void get(int r){
        this.r=r;
    }
    public void calci(){
        double area=3.14*r*r;
        System.out.println("Area= "+area);
    }
}
public class perimeter extends Area{
    double peri;
    public void calci(){
        peri=2*3.14*r;
        System.out.println("Perimeter= "+peri);
    }
    public static void main(String[] args) {
        Area obj=new Area();
        obj.get(4);
        obj.calci();
        obj=new perimeter();
        obj.get(5);
        obj.calci();
    }
}
