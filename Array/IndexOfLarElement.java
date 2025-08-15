// 7) Display index of largest number
public class IndexOfLarElement {
    public static int displayIndexOfLargestElement(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] x = { 10, 24, 45, 212, 11, 87, 6 };
        int indexOfLarElement = displayIndexOfLargestElement(x);
        System.out.print("Index of Largest Element is : " + indexOfLarElement);
    }
}