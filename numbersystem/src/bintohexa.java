import java.util.Scanner;
public class bintohexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String bin = sc.next();
        while (bin.length() % 4 != 0) {
            bin = "0" + bin;
        }
        String hex = "";
        for (int i = 0; i < bin.length(); i += 4) {
            int value = 0;
            value += (bin.charAt(i)   - '0') * 8;
            value += (bin.charAt(i+1) - '0') * 4;
            value += (bin.charAt(i+2) - '0') * 2;
            value += (bin.charAt(i+3) - '0') * 1;
            if (value < 10)
                hex = hex + value;
            else
                hex = hex + (char)(value - 10 + 'A');
        }
        System.out.println("Hexadecimal value: " + hex);
    }
}