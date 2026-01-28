public class dectooctal{
    public static void main(String[] args) {
        String oct=" ";
        int rem,dec=173;
        while(dec>0){
            rem=dec%8;
            if(rem<0)
                oct=rem+oct;
            else if(rem>0){
                oct=rem+oct;
            }
            System.out.println(oct);
            dec=dec/8;
        }
    }
}