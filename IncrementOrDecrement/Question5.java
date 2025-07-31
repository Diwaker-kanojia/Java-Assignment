package IncrementOrDecrement;

public class Question5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = x-- - --y + x++ + ++y; // (10 - 4 + 9 + 5) a = 10, b = 5
        System.out.println(z); // 20
    }
}