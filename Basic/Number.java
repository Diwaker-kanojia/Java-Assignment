import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Number is Zero");
        }
    }
}