import java.util.*;
class Al {
    int a;
    Al() {
        a = 0;
    }
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A = ");
        a = sc.nextInt();
    }
}
    class overrid extends Al {
        int b;
        overrid() {
            super();
            b = 0;
        }
        public void get() {
//            super.get();   //it will only call te b value
            Scanner sc = new Scanner(System.in);
            System.out.println("B= ");
            b = sc.nextInt();
        }
        public static void main(String[] args) {
            overrid obj = new overrid();
            obj.get();
        }
    }