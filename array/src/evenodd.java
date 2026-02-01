public class evenodd {
    public static void main(String[] args) {
        int a[]={1,2,5,3,8,4,67};
        int odd=0,even=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even number:"+even);
        System.out.println("Odd number: "+odd);
    }
}
