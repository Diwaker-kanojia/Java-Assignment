import java.util.Scanner;

class SmallestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int thirdNumber = sc.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("First Number is smallest.");
        } else if (secondNumber < thirdNumber) {
            System.out.println("Second Number is smallest.");
        } else {
             System.out.println("Third Number is smallest.");
        }
    }
}