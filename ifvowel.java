import java.util.Scanner;
public class ifvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("Enter a word:");
        c=sc.nextLine().charAt(1);
        if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u')
            System.out.println("Given word is a vowel");
    }
}
