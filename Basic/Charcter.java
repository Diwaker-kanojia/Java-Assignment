package Basic;

import java.util.Scanner;

public class Charcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char cha = sc.next().charAt(0);

        if (cha >= 'a' && cha <= 'z') {
            System.out.println("Lower Case");
        } else if (cha >= 'A' && cha <= 'Z') {
            System.out.println("Upper Case");
        } else if (cha >= '1') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Symbol");
        }

    }
}