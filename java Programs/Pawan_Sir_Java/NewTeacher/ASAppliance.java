/*
 * Problem Statement:
You are tasked with designing a system to manage a set of appliances. Each appliance has common characteristics and behaviors, but their operation may differ based on the type of appliance. Use abstract classes to model this system.

Instructions:
Abstract Class Design

Create an abstract class named Appliance with the following:
Fields:
String brand
boolean isOn
Constructor to initialize brand and set isOn to false initially.
Abstract method operate(): Defines the specific operation of an appliance.
Concrete methods:
turnOn(): Sets isOn to true and prints "The appliance is now ON."
turnOff(): Sets isOn to false and prints "The appliance is now OFF."
Subclasses

Create two subclasses of Appliance:
WashingMachine:
Override the operate() method to print "The washing machine is washing clothes."
Refrigerator:
Override the operate() method to print "The refrigerator is cooling items."
Driver Class

Create a Main class to:
Instantiate a WashingMachine and a Refrigerator.
Turn on each appliance and call their operate() method.
Turn off each appliance.


O/p:
Washing Machine:
The appliance is now ON.
The washing machine is washing clothes.
The appliance is now OFF.

Refrigerator:
The appliance is now ON.
The refrigerator is cooling items.
The appliance is now OFF.

 */


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
