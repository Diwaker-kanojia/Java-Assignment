// 11) Display those numbers from both array that are not common
public class NotCommon {

    public static void printNotCommon(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean fonund = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    fonund = true;
                    break;
                }
            }
            if (!fonund) {
                System.out.print(arr1[i] + " ");
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean fonund = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    fonund = true;
                    break;
                }
            }
            if (!fonund) {
                System.out.print(arr2[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] x = { 10, 34, 565, 23, 454, 8 };
        int[] y = { 45, 4, 34, 23, 44, 8, 34, 23 };
        printNotCommon(x, y);
    }
}
