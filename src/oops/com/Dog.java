package oops.com;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);  // Call the superclass constructor
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    @Override
    public String toString() {
        return "Dog [name=" + getName() + "]";
    }
}
