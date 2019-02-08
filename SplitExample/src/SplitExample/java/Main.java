package SplitExample.java;


public class Main {

    public static void main(String[] args) {
        String str = "12 text var2 14 8ю 1";

        System.out.println("We do get next:");

        String[] line = str.split("\\s");
        System.out.println(line);
        for (String st : line) {
            System.out.println(st.matches("\\d+"));
        }


    }
}
