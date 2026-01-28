public class dectohex {
    public static void main(String[] args) {
        String hex=" ";
        int rem,dec=254;
        while(dec>0){
            rem=dec%16;
            if(rem<10)
                hex=rem+hex;
            else if(rem>=10){
                hex=(char)((rem-10)+'A')+hex;
            }
            System.out.println(hex);
            dec=dec/16;
        }
    }
}
