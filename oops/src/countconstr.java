class countconstru{
    static int count = 0;  // without static it prints 1 in output

    countconstru() {
        count = count + 1;
    }


    public void disp() {
        System.out.println("Objects Created:" + count);
    }
}
class  countconstr{
    public static void main() {
        countconstru obj=new countconstru();
        countconstru obj1=new countconstru();
        countconstru obj2=new countconstru();
        obj.disp();
//        obj1.disp();
//        obj2.disp();
    }
}
