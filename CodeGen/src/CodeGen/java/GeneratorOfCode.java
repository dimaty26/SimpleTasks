package CodeGen.java;

import java.security.SecureRandom;
import java.util.ArrayList;

public class GeneratorOfCode {

        static final ArrayList<Character> massive =  new ArrayList<>(62);

        static {
            for (char c = 'A'; c <= 'z'; c++) {
                massive.add(c);
                //Исключаем лишние символы ( ],[,...)
                if (c == 'Z') c = 'a' - 1;
            }

            for (char c = '0'; c <= '9'; c++) {
                massive.add(c);
            }
        }

        public GeneratorOfCode() {
        }

        public static String getCode(int userNumber) {
            SecureRandom secureRandom = new SecureRandom();
            StringBuilder sb =  new StringBuilder();
            for (int i = 0; i < userNumber; i++){
                sb.append(massive.get(secureRandom.nextInt(massive.size())));
            }

            return sb.toString();
        }
}
