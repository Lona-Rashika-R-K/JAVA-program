public class ascdec {
    public static void main(String[] args) {
        int[] a = {10, 3, 4, 5, -9, 6,11};
        for (int i=0; i < a.length-1; i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println("Ascending order:"+a[i]);
        }
        for (int i=0; i < a.length-1; i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println("Descending order:"+a[i]);
        }
    }
}
