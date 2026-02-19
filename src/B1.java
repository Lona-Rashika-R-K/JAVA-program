import java.util.Scanner;
class Ar{
    int a;
    Ar() {
        a = 0;
    }
    public void get(int a) {
        this.a = a;
        System.out.println("A= " + a);
    }
}
class B1 extends Ar {
    int b;
    B1() {
        super();
        b = 0;
    }
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("B= ");
        b = sc.nextInt();
    }
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.get(10);
        obj.get();
    }
}