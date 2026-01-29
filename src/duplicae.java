public class duplicae {
    public static void main(String[] args) {
        int[] a={1,2,3,1,2,1,2,1,3,4,5};
        boolean[] v =new boolean[a.length];
        int c2=0,c1 = 0;
        for(int i=0;i<a.length;i++){
            if(v[i]==true)
                continue;
            for(int j=i+1;j<a.length;j++) {
                if (a[i] == a[j]) {
                    c1 += 1;
                    v[j] = true;
                }
            }
            if(c1>=2)
                c1=1;
            c2=c1+c2;
        }
        System.out.println(c2);
    }
}
