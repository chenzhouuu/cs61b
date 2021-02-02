public class Maximum {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int x = m[0];
        for (int i = 0; i < m.length - 1; i++) {
            if (m[i + 1] > x) {
                x = m[i + 1];
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6, 55};
        System.out.println(max(numbers));

    }
}
