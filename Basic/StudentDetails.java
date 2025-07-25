package Basic;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String studentName = sc.nextLine();

        System.out.print("Enter your age : ");
        int studentAge = sc.nextInt();

        System.out.print("Enter your percentage : ");
        double studentPercentage = sc.nextDouble();

        System.out.println("Name : " + studentName);
        System.out.println("Age  : " + studentAge);
        System.out.println("Percentage : " + studentPercentage + "%");
    }
}