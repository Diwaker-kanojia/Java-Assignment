import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        System.out.println("Last Digit of " + number + " is " + (number % 10));
    }
}