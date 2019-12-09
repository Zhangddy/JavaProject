import java.util.Arrays;

public class Day191208 {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = i + 1;
        }
        int[] a2 = {1, 2, 3, 4, 5};
        int[] a3 = new int[]{3, 2, 3, 5, 1, 9, 2};
        int[][] magicSquare = new int[][]{
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };

        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));
        String s = "Hello Java!";
        String str = new String("hehe");

        int i = Arrays.binarySearch(a3, 1);
        boolean b1 = Arrays.equals(a1, a2);
    }
}

