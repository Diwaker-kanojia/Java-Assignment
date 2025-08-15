// 5) Display those numbers from array x that are greater than their adjacent number

public class GreaterAdjacent {
    public static void printGreaterAdjacent(int[] arr) {
        if (arr[0] > arr[1]) {
            System.out.print(arr[0] + " ");
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            System.out.print(arr[arr.length - 1] + " ");
        }
    }

    public static void main(String[] args) {
        int[] x = { 100, 24, 45, 12, 1, 87, 6 };
        System.out.print("The numbers greater than their adjacent numbers are: ");
        printGreaterAdjacent(x);
    }
}