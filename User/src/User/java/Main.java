package User.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception{
	    User user = new User();
	    user.lifeLevel = 55;
	    user.staticField = 45;
	    Sword sword = new Sword();
	    sword.level = 5;
	    user.sword = sword;

        FileOutputStream fileOutputStream = new FileOutputStream("d:/data4.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        user.staticField = 35;

        FileInputStream fileInputStream = new FileInputStream("d:/data4.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.staticField);
        System.out.println(newUser.sword);

        Date date = new Date();
        System.out.println(date);
    }
}
