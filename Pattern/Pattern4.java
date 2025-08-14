public class Pattern4 {

    public static void printPattern4(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print((char) ('A' + j));
            }

            int spaces = i * 2 - 1;
            if (spaces > 0) {
                for (int s = 0; s < spaces; s++) {
                    System.out.print(" ");
                }
            }

            int start = (spaces > 0) ? rows - i - 1 : rows - i - 2;
            for (int j = start; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern4(5);
    }
}