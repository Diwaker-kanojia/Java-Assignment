/* 4) i)Display sum of both array numbers
      ii)Display those numbers from array x that are not present in array y
      iii)Display those numbers that are common in both array
*/
public class Array {
    public static void displaySum(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = arr1[i] + arr2[i];
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void displayNotPresent(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr1[i] + " ");
            }
        }
        System.out.println();

    }

    public static void displayCommon(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] x = { 10, 24, 45, 12, 1, 87, 6 };
        int[] y = { 123, 92, 6, 10, 11, 4, 16 };
        displaySum(x, y);
        displayNotPresent(x, y);
        displayCommon(x, y);
    }
}
