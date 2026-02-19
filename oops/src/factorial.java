class Facto{
    int n,fact;
    Facto(){
        fact=1;
        n=5;
    }
    public void calci(){
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial="+fact);
    }
}
class factorial {
    public static void main(String[] args) {
        Facto obj=new Facto();
        obj.calci();
    }
}
