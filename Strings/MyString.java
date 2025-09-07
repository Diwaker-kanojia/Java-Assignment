public final class MyString {
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

    // to find the lastIndexof
    public int lastIndexOf(char ch) {
        int lastIndex = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == ch) {
                lastIndex = i;
                continue;
            }
        }
        return lastIndex;
    }

    // for substring
    public String subString(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > value.length || fromIndex > toIndex) {
            return "Invalid Indexes";
        }

        StringBuffer str = new StringBuffer();
        for (int i = fromIndex; i < toIndex; i++) {
            str.append(value[i]);
        }
        return str.toString();
    }

    // for substring
    public String subString(int toIndex) {
        if (toIndex < 0 || toIndex > value.length) {
            return "Invalid Index";
        }

        StringBuffer str = new StringBuffer();
        for (int i = 0; i < toIndex; i++) {
            str.append(value[i]);
        }
        return str.toString();
    }

    // for uppercase
    public String toUpperCase() {
        StringBuffer string = new StringBuffer();

        for (int i = 0; i < value.length; i++) {
            char ch = value[i];
            if (ch >= 'a' && ch <= 'z') {
                string.append((char) (ch - 32));
            } else {
                string.append(ch);
            }
        }
        return string.toString();
    }

    // for lowercase
    public String toLowerCase() {
        StringBuffer string = new StringBuffer();

        for (int i = 0; i < value.length; i++) {
            char ch = value[i];
            if (ch >= 'A' && ch <= 'Z') {
                string.append((char) (ch + 32));
            } else {
                string.append(ch);
            }
        }
        return string.toString();
    }

    // for toggleCase
    public String toToggleCase() {
        StringBuffer string = new StringBuffer();

        for (int i = 0; i < value.length; i++) {
            char ch = value[i];
            if (ch >= 'A' && ch <= 'Z') {
                string.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                string.append((char) (ch - 32));
            } else {
                string.append(ch);
            }
        }
        return string.toString();
    }

}