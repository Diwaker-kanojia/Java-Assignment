public class Pattern5 {
    public static void printPattern5(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i < rows - 1) {
                int middleSpaces = (rows - i - 1) * 2 - 1;
                if (middleSpaces > 0) {
                    for (int m = 0; m < middleSpaces; m++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 5;
        printPattern5(row);
    }
}