package IncrementOrDecrement;

public class Question2 {
    public static void main(String[] args) {
        int a = 12;
        int b = a++; // value of a is increment and return old value of a = 12 and now b = 12 and new value of  a = 13.
        b++; // value of b = 13
        int c = a++ + -b; // 13 + (-13) , value of a = 14, b = 13 and c = 0
        System.out.println(a); // 14
        System.out.println(b); // 13
        System.out.println(c); // 0
    }
}