package IncrementOrDecrement;

public class Question12 {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int c = ++a + b++; // (9 + 12) a = 9 , b = 13, c = 21
        c--; // c = 20
        --b; // b = 12
        int d = c-- + ++b + ++a; // (20 + 13 + 10 ) c = 19, b = 14, a = 10, d = 44
        int e = a + ++b + c + d++; // (10 + 14 + 19 + 43) e = 86
        System.out.println(e); // 86
    }
}