public class MyString extends Object {
    public final char[] value;

    public MyString(String str) {
        value = str.toCharArray();
    }

    // length
    public int length() {
        return value.length;
    }

    // override toString Method
    public String toString() {
        return "to String method";
    }

    // to find the index of any character
    public char charAt(int index) {
        if (index > value.length) {
            return ' ';
        }
        return value[index];
    }
}