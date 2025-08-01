import java.util.Scanner;

public class CountNumber {
    public static int countdigit(int number) {

        if (number == 0) {
            return 1;
        }

        int count = 0;
        
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int count = countdigit(number);
        System.out.println("Total Digit in " + number + " is " + count);
    }
}
