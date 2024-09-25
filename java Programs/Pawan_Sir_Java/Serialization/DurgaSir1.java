import java.io.*;
import java.util.Scanner;

class Dog implements Serializable {
    public void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Content");
        String i = sc.nextLine();
    }
}

class SerializableDemo {
    public static void main(String args[]) throws Exception {
        Dog d1 = new Dog();

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog) ois.readObject();
        System.out.println(d2.m1());
    }
}