package IncrementOrDecrement;

public class Question4 {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        int c = a++ + b++ - ++a - --a; // (12 + 20 - 14 - 13) a = 13, b =21, c = 5
        System.out.println(c); // 5
    }
}