import java.io.*;

class Test1 implements Serializable {
    int a = 20;
    transient int b = 10;
}

public class Transient1 {
    public static void main(String[] args) throws Exception {

        Test1 t = new Test1();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t);
        System.out.println("Object serialized successfully. ");

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Test1 t2 = (Test1) ois.readObject();
        System.out.println(t.a + "....." + t2.b);
    }
}
