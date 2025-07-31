package IncrementOrDecrement;

public class Question9 {
    public static void main(String[] args) {
        int x = 12;
        int y = x++ + ++x; // (12 + 14) x = 15 , y = 26
        y++; // y = 27
        int z = ++y; // y = 28 , z = 28
        int p = x++ - ++y + z++; // (14 - 29 + 28) x = 15 , y = 29 , z = 29 
        System.out.println(x); // 15
        System.out.println(y); // 29
        System.out.println(z); // 29
        System.out.println(p); // 13
    }
}