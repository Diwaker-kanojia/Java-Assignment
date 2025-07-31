package IncrementOrDecrement;

public class Question7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a-- + ++b - b-- + ++a; // (5 + 11 - 10 + 5) a = 5 , b = 10
        System.out.println(c); // 10
    }
}