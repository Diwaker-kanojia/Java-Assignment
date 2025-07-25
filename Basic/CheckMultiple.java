package Basic;

import java.util.Scanner;

public class CheckMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if (number % 3 == 0 || number % 7 == 0) {
            System.out.println("Number is multiple of 3 or 7");
        } else {
            System.out.println("Number is not multiple of 3 or 7");
        }
    }
}