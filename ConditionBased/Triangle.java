import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side of triangle : ");
        int firstSide = sc.nextInt();

        System.out.print("Enter second side of triangle : ");
        int secondSide = sc.nextInt();

        System.out.print("Enter third side of triangle : ");
        int thirdSide = sc.nextInt();

        if (firstSide == secondSide && secondSide == thirdSide) {
            System.out.println("Equilateral Triangle");
        } else if (firstSide == secondSide || secondSide == thirdSide || firstSide == thirdSide) {
            System.out.println("Isosceles Traingle");
        } else {
            System.out.println("Scalene Traingle");
        }
    }
}
