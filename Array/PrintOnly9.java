//  2) Display those numbers that have 9 as last digit
public class PrintOnly9 {
    public static void printLastHave9(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 9) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] x = { 10, 45, 17, 49, 49, 123, 56, 7, 19 };
        printLastHave9(x);
    }
}
