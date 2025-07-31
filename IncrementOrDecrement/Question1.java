package IncrementOrDecrement;

class Question1 {
    public static void main(String[] args) {
        int a = 20; // value of a is 20
        a++; // this will increment value of a (a = 21)
        int b = a++; // here value of a is increment by one and return the old value of a which is
                     // 21.
        int c = ++b; // increment by one and return a new value 22
        System.out.println(a); // 22
        System.out.println(b); // 22
        System.out.println(c); // 22
    }
}