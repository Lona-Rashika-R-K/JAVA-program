import java.util.*;
    class circle {
        double pi = 3.14, r, area;
        public void cir() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius:");
            r = sc.nextInt();
            area = (pi * r * r);
            System.out.println("Area of circle:" + area);
        }
    }
    class square extends circle {
        int a, area1;

        public void sqrt() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
            area1 = a * a;
            System.out.println("Area of square:" + area1);
        }
    }
    class shape extends square{
        double l, b, area2;
        public void rect() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        l=sc.nextInt();
        System.out.println("Enter breadth:");
        b=sc.nextInt();
            area2 = l * b;
            System.out.println("Area of rectangle:" + area2);
        }
        public static void main(String[] args) {
            shape obj = new shape();
            obj.cir();
            obj.sqrt();
            obj.rect();
        }
    }
