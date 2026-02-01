import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] a={0,1,5,6};
        int[] b={1,2,3,8 };
        int [] c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
            c[a.length+i]=b[i];
        }
        System.out.println(Arrays.toString(c));
//        int k=0;
//        for(int i=0;i<a.length;i++){
//            c[k]=a[i];
//            k++;
//        }
//        for(int i=0;i<b.length;i++){
//            c[k]=b[i];
//            k++;
//        }
//        for(int i=0;i<c.length;i++){
//            System.out.println(c[i]+" ");
//        }
    }
}
