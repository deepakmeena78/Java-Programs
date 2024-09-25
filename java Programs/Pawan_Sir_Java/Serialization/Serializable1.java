import java.io.*;

class Test implements Serializable {
    int a = 10;
}

public class Serializable1 {
    public static void main(String[] args) throws Exception {
        Test t = new Test();

        FileOutputStream op = new FileOutputStream("meenaji.ser");
        ObjectOutputStream ob = new ObjectOutputStream(op);
        ob.writeObject(t);

        FileInputStream am = new FileInputStream("meenaji.ser");
        ObjectInputStream ma = new ObjectInputStream(am);
        Test t2 = (Test) ma.readObject();
        System.out.println(t2.a + "  ");
    }
}
