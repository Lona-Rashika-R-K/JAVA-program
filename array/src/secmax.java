class secmax {
    public static void main(String[] args) {
        int[] a = {4, 2, 8, 1, 3};
        int max = a[0];
        int secondMax = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }

        }
        System.out.println("Second maximum element = " + secondMax);
    }
}
