package J2025_14_05.Array;

public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[3];          // Forma 1
        int[] array2 = new int[]{1, 2, 3};  // Forma 2
        int[] array3 = {1, 2, 3};  // Forma 3

        array1[0] = 30;
        array2[1] = 60;
        array3[2] = 90;

        for (int num : array1) {
            System.out.println(num);
        }
    }
}
