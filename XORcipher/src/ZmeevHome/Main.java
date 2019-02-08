package ZmeevHome;

import java.io.UnsupportedEncodingException;

public class Main {

    public static final String reverseWithXOR(String string) {
        char[] array = string.toCharArray();
        int length = array.length;
        int half = (int) Math.floor(array.length / 2);
        for (int i = 0; i < half; i++) {
            array[i] ^= array[length - i - 1];
            array[length - i - 1] ^= array[i];
            array[i] ^= array[length - i - 1];
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String pText = "Eat more of these soft french roll";
        byte[] encode = Coder.encode(pText, "habra");
        String decode = Coder.decode(encode, "habra");
        System.out.println(new String(encode, "UTF-8"));
        System.out.println(decode);
    }
}
