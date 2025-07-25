package Basic;

public class SwapThree {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        System.out.println("Before Swapping");
        System.out.println("A : " + a + ", B : " + b + ", C : " + c);

        int temp;
        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After Swapping");
        System.out.println("A : " + a + ", B : " + b + ", C : " + c);
    }
}