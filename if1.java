import java.util.Scanner;
public class if1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("enter h or t:");
        c=sc.nextLine().charAt(0);// are we can use next() method instead of nextLine()
        if(c=='h')
            System.out.println("you are lucky");
    }
}
