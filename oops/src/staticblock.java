class Example{
    static int count;
    static{
        count=0;
        System.out.println("Static member Initialized");
    }
    Example(){
        count=count+1;
    }
    static void disp(){
        System.out.println("Count="+count);
    }
}
class staticblock {
    public static void main(){
        System.out.println("Driver class started");
        Example obj=new Example();
        Example obj1=new Example();
        Example.disp();
    }
}
