// 3) Display sum of all digits of each number
public class SumOfAllDigit {
    public static void sumOfAllDigit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int number = arr[i];
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        int[] x = { 10, 45, 15, 49, 49, 123, 24, 7, 4011 };
        sumOfAllDigit(x);
    }
}
