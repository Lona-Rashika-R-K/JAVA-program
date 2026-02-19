class goat{
    protected int a;
    goat(int a){
        this.a=a;
    }
}
class deer extends goat {
    int b;
    deer(int a,int b) {
        super(a);
        this.b=b;
    }
}
public class tiger {
    int c;
    public void eat(deer meat) {
        c = meat.a +meat.b;
        System.out.println("Total deer and goat eaten by tiger are :" + c);
    }
    public static void main(String[] args) {
        deer meat=new deer(2,3);
        tiger food= new tiger();
        food.eat(meat);
    }
}