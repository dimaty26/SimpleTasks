package MegaGenerator.java;

import java.security.SecureRandom;

public class SuperMegaRandomGenerator {
    /**
     * generates string, containing symbols A-Z, a-z and numbers 0-9
     * @param len - the length of generated string
     * @return a {@Code String} of length {@Code len}
     */
    public static String generateCharNumString(int len) {
        SecureRandom rand = new SecureRandom();
        StringBuilder buf = new StringBuilder(len);

        int num;
        for (int i = 0; i < len; i++){
            num = rand.nextInt(62);
            if(num < 10) { // range 0-9
                buf.append((char) (num + 48)); //48-57 codes is numbers in UTF-16
            } else if (num < 36) { //range 10-35
                buf.append((char) (num + 55)); //10+55=65, 65-90 is letters A-Z in UTF-16
            } else {
                buf.append((char) (num + 61)); //36+61=97, 97-122 is letter a-z in UTF-16
            }
        }
        return buf.toString();
    }

    /**
     * generates string, containing numbers 0-9
     * @param len - the length of generated string
     * @return a {@Code String} of length {@Code len}
     */

    public static String generateNumericString(int len) {
        SecureRandom rand = new SecureRandom();
        StringBuilder buf = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            buf.append((char)(rand.nextInt(10) + 48));
        }
        return buf.toString();
    }
}
