// 1) Create new array y of size x and copy the nmubers of array x into y in reverse order

import java.util.Arrays;

class CopyReverse {
    public static void copyReverseArray(int[] arr) {
        int[] y = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            y[i] = arr[arr.length - i - 1];
        }

        System.out.println(Arrays.toString(y));
    }

    public static void main(String[] args) {
        int[] x = { 10, 45, 17, 49, 49, 123, 56, 7, 1 };
        copyReverseArray(x);

    }
}