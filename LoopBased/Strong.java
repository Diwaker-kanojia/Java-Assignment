import java.util.Scanner;

public class Strong {

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

    public static boolean isStrong(int number) {
        int temp = number;
        int sumOfFact = 0;
        int remainder;
        while (temp != 0) {
            remainder = temp % 10;
            sumOfFact += factorial(remainder);
            temp /= 10;
        }
        return (sumOfFact == number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        if (isStrong(number)) {
            System.out.println("Number is strong.");
        } else {
            System.out.println("Number is not strong.");
        }
    }
}
