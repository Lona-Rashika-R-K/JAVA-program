class countc{
    static int count = 0;  // without static it prints 1 in output
    countc() {
        count = count + 1;
    }
    public void disp() {
        System.out.println("Objects Created:" + count);
    }
}
class  staticmeth{
    public static void main() {
        countc obj=new countc();
        countc obj1=new countc();
        countc obj2=new countc();
       // countc.disp();  // for static only
        obj.disp();
//        obj1.disp();
//        obj2.disp();
    }
}
