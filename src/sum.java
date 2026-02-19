import java.util.Scanner;
class Aa{
    int a,b;
    public void getdata(){
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
}
class sum extends Aa{
    int c;
    public void sum(){
        c=a+b;
        System.out.println("Sum="+c);
    }
    public static void main(String[] args){
        sum obj=new sum();
        obj.getdata();
        obj.sum();
    }
}