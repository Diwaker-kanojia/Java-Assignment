public class MyString {
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
        return new String(value);
    }

    // to find the character of given index
    public char charAt(int index) {
        if (index < 0 || index >= value.length) {
            return ' ';
        }
        return value[index];
    }

    // to find the index of character
    public int indexOf(char ch) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    //
}