package oops.com;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow! Meow!");
    }

    @Override
    public String toString() {
        return "Cat [name=" + getName() + "]";
    }
}

