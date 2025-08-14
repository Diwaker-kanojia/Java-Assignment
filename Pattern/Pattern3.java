class Pattern3 {
    public static void printPattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = n - row; s >= 1; s--) {
                System.out.print(" ");
            }
            int count = 1;
            for (int col = row; col >= 1; col--) {
                System.out.print(count);
                count++;
            }
            for (int col = row-1; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 6;
        printPattern3(row);
    }
}