import java.util.*;
class Circl {
    double r, area;

    private void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r:");
        r = sc.nextDouble();
    }

    public void calci() {
        getdata();
        area = 3.14 * r * r;
        System.out.println("Area=" + area);
    }
}
    class privat {
        public static void main(String[] args) {
            Circl obj = new Circl();
            obj.calci();
        }
    }