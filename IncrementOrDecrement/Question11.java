package IncrementOrDecrement;

public class Question11 {
    public static void main(String[] args) {
        int a = 12;
        a++; // a = 13
        ++a; // a =14
        int b = a++; // b = 14 , a = 15
        b++; // b = 15
        int c = a++ + -b; // (15 + -15) // a = 16 , b = 14 , c = 0
        c--; // c = -1
        --b; // 14
        int d = ++a + b++ + --c; // (17 + 14 + -2)  a = 17, b = 15, c = -2, d = 29
        System.out.println(a); // 17
        System.out.println(b); // 15
        System.out.println(c); // -2
        System.out.println(d); // 29
    }
}