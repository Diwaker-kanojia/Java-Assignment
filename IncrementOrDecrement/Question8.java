package IncrementOrDecrement;

public class Question8 {
    public static void main(String[] args) {
        int x = 12;
        x = x++; // x = 12
        x = x++; // x = 12
        x = x++; // x = 12
        x = ++x; // x = 13
        x = x++; // x = 13
        System.out.println(x); // 13
    }
}