public class Pattern2 {

    public static void printPattern2(int number) {
        char ch = 'A';
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 6;
        printPattern2(row);
    }
}