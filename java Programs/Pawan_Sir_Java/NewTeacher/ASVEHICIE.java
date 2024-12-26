/*
 * 
 * Assignment 4:
Create a parent class Vehicle with a method speed() that prints "Speed varies for different vehicles."
Create subclasses:
Car that overrides speed() to print "The car speed is 120 km/h."
Bike that overrides speed() to print "The bike speed is 80 km/h."
Use polymorphism to display the speed of different vehicles in the Main class.

 */

class Vehicle {
    public void speed() {
        System.out.println("Speed varies for different vehicles");
    }
}

class Car extends Vehicle {
    public void speed() {
        System.out.println("The car speed is 120 km/h.");
    }
}

class Bike extends Vehicle {
    public void speed() {
        System.out.println("The bike speed is 80 km/h");
    }
}

public class ASVEHICIE {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.speed();

        Vehicle c = new Car();
        c.speed();

        Vehicle b = new Bike();
        b.speed();
    }
}
