package Basic;

import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int temp = number;
        int lastNumber = number % 10;

        while (temp >= 10) {
            temp /= 10;
        }
        int firstNumber = temp;

        System.out.println("Original Number : " + number);
        System.out.println("First Number : " + firstNumber);
        System.out.println("Last Number : " + lastNumber);

    }
}