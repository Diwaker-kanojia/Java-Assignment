// 9) Display those numbers that are common in both array

public class Common {
    public static void printCommonElement(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                System.out.print(arr1[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] x = { 10, 34, 565, 23, 454, 8 };
        int[] y = { 45, 4, 34, 23, 44, 8, 34, 23 };
        printCommonElement(x, y);
    }
}
