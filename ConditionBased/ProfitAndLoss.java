import java.util.Scanner;

public class ProfitAndLoss {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Cost Price : ");
    double costPrice = sc.nextInt();

    System.out.print("Enter the Selling Price : ");
    double sellingPrice = sc.nextInt();

    double profitOrLoss = sellingPrice - costPrice;

    if (profitOrLoss > 0) {
        double profitPercentage = (profitOrLoss/costPrice)  * 100;
        System.out.println("Profit of "+profitPercentage+"%");
    } else {
        double profitPercentage = (profitOrLoss/costPrice)  * 100;
        System.out.println("Loss of "+profitPercentage+"%");
    }
   }
}