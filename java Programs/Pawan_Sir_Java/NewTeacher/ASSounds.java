/*
 * 2.
Create a parent class Animal with a method makeSound() that prints "Some generic sound."
Create subclasses:
Dog that overrides makeSound() to print "Woof Woof."
Cat that overrides makeSound() to print "Meow Meow."
In the Main class, use polymorphism to call makeSound() on different Animal objects.

 */
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow Meow.");
    }
}

public class ASSounds {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.makeSound();
        Animal a1 = new Cat();
        a1.makeSound();
    }
}
