public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                for (int j = 0; j < n; j++) {
                    if (i + j + 1 >= a.length) {
                        break;
                    }
                    a[i] = a[i] + a[i + j +1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
        int[] b = {1, -1, -1, 10, 5, -1};
        int n1 =2;
        windowPosSum(b, n1);
        System.out.println(java.util.Arrays.toString(b));
    }
}