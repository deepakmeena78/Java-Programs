import java.io.*;

class Test implements Serializable {
    int a = 20;
    int b = 10;
}

public class Practice1 {
    public static void main(String[] args) throws Exception {

        Test t = new Test();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t);
        System.out.println("Object serialized successfully. ");

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Test t2 = (Test) ois.readObject();
        System.out.println(t.a + "....." + t2.b);

    }
}