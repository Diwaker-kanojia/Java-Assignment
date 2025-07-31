package IncrementOrDecrement;

public class Question6 {
    public static void main(String[] args) {
        int x = 5;
        int result = x++ - --x + x-- - --x; //  (5 - 5 + 5 - 3)  x = 3
        System.out.println(result); // 2
    }
}