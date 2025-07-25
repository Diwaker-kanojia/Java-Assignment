package Basic;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your Marks : ");
     int marks = sc.nextInt();

     if (marks > 90) {
        System.out.println("Grade A ");
     } else if(marks > 80) {
        System.out.println("Grade B ");
     } else if (marks > 70) {
        System.out.println("Grade C ");
     } else {
        System.out.println("Fail");
     }
    }
}