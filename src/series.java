public class series {
    public static void main(String[] args) {
        int sum=0,num=0;
        for(int i=1;i<=4;i++) {
            num = num * 10 + 9;
            sum = sum + num;
            System.out.println(sum);
        }
    }
}
