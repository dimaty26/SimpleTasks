package brackets.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Please enter the brackets below");
        String str = getString();
        if (Brackets(str)) {
            System.out.println("Good boy");
        } else System.out.println("Bullshit");
    }

    public static String getString() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(reader.readLine());
        return s;
    }

    public static boolean Brackets(String str) {

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                count1++;
            else if (str.charAt(i) == ')')
                count2++;
            else return false;
        }

        if (count1 == count2)
            return true;
         else
            return false;
    }
}
