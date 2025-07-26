import java.util.Scanner;

public class AlphabetOrDigitOrSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char cha = sc.next().charAt(0);

        if (cha >= 'a' && cha <= 'z') {
            System.out.println("Alphabet");
        } else if (cha >= 'A' && cha <= 'Z') {
            System.out.println("Alphabet");
        } else if (cha >= '1') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Symbol");
        }

    }
}