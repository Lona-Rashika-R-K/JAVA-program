//public class leader{
//    public static void main(String[] args) {
//        int[] a = {1, 3, 4, 6, 2, 9};
//        int i;
//        for (i = 1; i < a.length; i++) {
//            boolean flag = true;
//            for (int j = i + 1; j < a.length - 1; j++) {
//                if (a[i] < a[j]) {
//                    flag = false;
//                    break;
//                }
//            }
//                if (flag)
//                    System.out.println(a[i]);
//            }
//        }
//    }

public class leader {
    public static void main(String[] args) {
        int[] a = {8,9,6,5};
        int max=a[a.length-1];
        for(int i =a.length-2;i>=0; i--) {
            if (a[i] > max) {
                max = a[i];
                System.out.println(" " + a[i]);
            }
        }
    }
}
