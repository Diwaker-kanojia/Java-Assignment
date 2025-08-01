import java.util.Scanner;

public class AppearDigit {
    public static int countAppear(int num, int checknum) {
        int count = 0;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            if (remainder == checknum) {
                count++;
            }
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        System.out.print("Enter number for checking Appearance : ");
        int appearNumber = sc.nextInt();

        System.out.println(
                "Appearance of " + appearNumber + " in " + number + " is " + countAppear(number, appearNumber));

    }
}
