class A{
    protected int a;
    A(int a){
        this.a=a;
    }
}
class B extends A {
    int b;
   B(int a,int b) {
        super(a);
        this.b=b;
    }
}
    public class three {
        int c;
        public void calci(B obj) {
            c = obj.a + obj.b;
            System.out.println("Sum = " + c);
        }
        public static void main(String[] args) {
            B obj=new B(2,3);
            three obj1 = new three();
            obj1.calci(obj);
        }
    }