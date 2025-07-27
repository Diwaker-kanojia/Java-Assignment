import java.util.Scanner;

public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics Marks : ");
        int physicsMarks = sc.nextInt();
        System.out.print("Enter Chemistry Marks : ");
        int chemistryMarks = sc.nextInt();
        System.out.print("Enter Biology Marks : ");
        int biologyMarks = sc.nextInt();
        System.out.print("Enter Maths Marks : ");
        int mathsMarks = sc.nextInt();
        System.out.print("Enter  Computer Marks :");
        int computerMarks = sc.nextInt();

        double percentage = (physicsMarks + chemistryMarks + biologyMarks + mathsMarks + computerMarks) / 5;

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Fail");
        }
    }
}