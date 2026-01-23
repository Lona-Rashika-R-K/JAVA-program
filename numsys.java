public class numsys {
    public static void main(String[] args) {
       int octal=012+013;
        System.out.println(Integer.toHexString(octal).toUpperCase());
        System.out.println(octal);
        int hexa=0xA+0xC;
        System.out.println(Integer.toOctalString(hexa));
        System.out.println(hexa);
    }
}
