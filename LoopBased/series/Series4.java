public class Series4 {
    public static int printSelf(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int term = 5;
        for (int i = 1; i <= term; i++) {
            System.out.print(printSelf(i) + " ");
        }
    }
}