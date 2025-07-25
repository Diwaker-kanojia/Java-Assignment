import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to check Leap year or not");
        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Year is Leap year");
        } else {
            System.out.println("Year is not a Leap year");
        }

    }
}