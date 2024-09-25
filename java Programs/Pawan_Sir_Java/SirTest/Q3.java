interface Flyable {
    public void fly();
}

class Spacecraft implements Flyable {
    public void fly() {
        System.out.println("Class SpaceCraft : Fly :");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Class Airplane : Fly");
    }
}

class Helicopter implements Flyable {
    public void fly() {
        System.out.println("Class Helicopter : Fly");
    }
}

public class Q3 {
    public static void main(String[] args) {

        Helicopter h = new Helicopter();
        h.fly();
        Airplane a = new Airplane();
        a.fly();
        Spacecraft s = new Spacecraft();
        s.fly();
    }
}
