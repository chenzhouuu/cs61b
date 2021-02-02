public class Maximum {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int count = 0;
        int x = m[0];
        while (count < m.length - 1) {
            int y = m[count + 1];
            if (x < y) {
                x = y;
            }
            count = count + 1;
        }
        return x;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));

    }
}

