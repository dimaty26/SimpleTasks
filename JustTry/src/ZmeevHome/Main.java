package ZmeevHome;


public class Main {

    public String name;

    public static void main(String args[]) {
        Main m = new Main();
        anotherMethod(m);
    }

    static void anotherMethod(Main m) {
        m.name = "anotherName";
        System.out.println(m.name);
    }

    static int returnByte() {
        byte a = 10;
        return a;
    }
}
