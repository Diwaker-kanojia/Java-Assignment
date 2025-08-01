import java.util.Scanner;

public class LargestDigit {

    public static int largestDigit(int number) {
        if (number < 10) {
            return number;
        }
        int max = 0;
        int remainder;
        while (number != 0) {
            remainder = number % 10;
            max = remainder > max ? remainder : max;
            number /= 10;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        System.out.println("Largest Digit in " + number + " is " + largestDigit(number));
    }
}