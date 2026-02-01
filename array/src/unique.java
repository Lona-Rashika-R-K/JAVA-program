public class unique {
    public static void main(String[] args) {
        int[] a={1,2,1,2,3};
        boolean[] v
                =new boolean[a.length];
        int c1 = 0;
        for(int i=0;i<a.length;i++) {
            if (v[i] == true)
                continue;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c1 += 1;
                    v[j] = true;
                }
            }
            if (c1 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println(c1);
    }
}
