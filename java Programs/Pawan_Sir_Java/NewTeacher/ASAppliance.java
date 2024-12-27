abstract class Appliance {
    String brand;
    boolean isOn;

    public Appliance(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    public Appliance() {
    }

    abstract public void operate();

    public void turnOn() {
        this.isOn = true;
        System.out.println("The appliance is now ON");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("The appliance is now OFF");
    }
}

class WashingMachine extends Appliance {

    public WashingMachine(String brand) {
        super(brand);
    }

    public void operate() {
        System.out.println("The washing machine is washing clothes");
    }
}

class Refrigerator extends Appliance {
    public Refrigerator(String brand) {
        super(brand);
    }

    public void operate() {
        System.out.println("The refrigerator is cooling items");
    }
}

public class ASAppliance {
    public static void main(String[] args) {

        WashingMachine w = new WashingMachine("LG");
        System.out.println(w.brand);
        w.turnOn();
        w.operate();
        w.turnOff();

        Refrigerator r = new Refrigerator("Samsung");
        System.out.println(r.brand);
        r.turnOn();
        r.operate();
        r.turnOff();
    }
}
