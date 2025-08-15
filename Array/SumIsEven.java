// 8) Display those numbers whose digit's sum is even

public class SumIsEven {
    public static void printIfSumIsEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int number = arr[i];
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum % 2 == 0) {
                System.out.print(arr[i] + " ");
            }

        }
    }

    public static void main(String[] args) {
        int[] x = { 10, 24, 45, 212, 11, 87, 6 };
        printIfSumIsEven(x);
    }
}
