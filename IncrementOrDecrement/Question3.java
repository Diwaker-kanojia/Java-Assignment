package IncrementOrDecrement;

public class Question3 {
    public static void main(String[] args) {
        int a = 10;
        a++; // a = 11
        int b = ++a; // b = 12 , a = 12
        int c = a++ + ++b; // (12 + 13)  c = 25, a = 13, b = 13
        b++; // b = 14
        System.out.println(a); // a = 13
        System.out.println(b); // b = 14
        System.out.println(c); // c = 25
    }
}