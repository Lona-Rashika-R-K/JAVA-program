import java.util.*;
class Fact{
    int n,fact;
    Fact(int n){
        fact=1;
        this.n=n;
    }
    public void calci(){
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial="+fact);
    }
}
class parafact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fact obj=new Fact(n);
        obj.calci();
    }
}
