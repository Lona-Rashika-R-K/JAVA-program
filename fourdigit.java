import java.util.Scanner;
public class fourdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a>1000&a<=9999)?"Four digit number":"not a four digit number");
    }
}
