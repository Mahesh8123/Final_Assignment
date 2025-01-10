package oops.com;

public abstract class Animal {
    private String name;  // Private to enforce encapsulation

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void makeSound();

    // toString method
    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }
}

