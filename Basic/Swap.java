package Basic;

// Swap two variable without using third number
public class Swap {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;

        System.out.println("Before Swapping");
        System.out.println("Number1 : " + number1 + "\nNumber2 : " + number2);

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("After Swapping");
        System.out.println("Number1 : " + number1 + "\nNumber2 : " + number2);

    }
}
