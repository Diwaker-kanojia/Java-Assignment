public class Series3 {

    public static void printFiboSeries(int term) {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 1; i <= term; i++) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

    public static void main(String[] args) {
        int nthTerm = 11;
        printFiboSeries(nthTerm);
    }
}