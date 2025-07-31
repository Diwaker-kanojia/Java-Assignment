package IncrementOrDecrement;

public class Question10 {
    public static void main(String[] args) {
        int a = 12;
        int b = a++; // b = 12 ,a = 13
        b++; // b = 13
        int c = a++ + --b; // (13 + 12) a = 15, b = 13, c = 26
        int d = a++ + ++b + c++; // (14 + 13 + 25) d = 52
        d++; // d = 53
        c--; // c = 25
        System.out.println(a); // 15
        System.out.println(b); // 13
        System.out.println(c); // 25
        System.out.println(d); // 53
    }
}