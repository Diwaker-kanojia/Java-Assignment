import java.util.Scanner;

class SmallestFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter the Third Number : ");
        int thirdNumber = sc.nextInt();

        System.out.print("Enter the Fourth Number : ");
        int FourthNumber = sc.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < FourthNumber) {
            System.out.println("First Number is smallest");
        } else if (secondNumber < thirdNumber && secondNumber < FourthNumber) {
            System.out.println("Second Number is smallest");
        } else if (thirdNumber < FourthNumber) {
            System.out.println("Third Number is smallest");
        } else {
            System.out.println("Fourth Number is smallest");
        }

    }
}