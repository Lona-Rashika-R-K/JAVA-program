public class dectobinary{
    public static void main(String[] args) {
        String bin=" ";
        int rem,dec=173;
        while(dec>0){
            rem=dec%2;

            if(rem<10)
                bin=rem+bin;
            else if(rem>=10){
                bin=rem+bin;
            }
            System.out.println(bin);
            dec=dec/2;
        }
    }
}