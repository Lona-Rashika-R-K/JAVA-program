import java.util.Scanner;
public class bintooctal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bin=sc.nextLine();
        while(bin.length()%3!=0){
            bin="0"+bin;
    }
        String oct = " ";
        for(int i=0;i<bin.length();i=i+3){
            int value=0;
            value+=(bin.charAt(i)-'0')*4;
            value+=(bin.charAt(i+1)-'0')*2;
            value+=(bin.charAt(i+2)-'0')*1;
//            int value=(bin.charAt(i)-'0')*4+(bin.charAt(i+1)-'0')*2+(bin.charAt(i+2)-'0')*1;
            oct=oct+value;
            System.out.println(oct);
        }
    }
}