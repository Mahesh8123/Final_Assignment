package oops.com;

public class Main2 {
    public static void main(String[] args) {
        // Array of Animal objects
        Animal[] animals = {
            new Dog("Buddy"),
            new Cat("Whiskers"),
            new Dog("Max"),
            new Cat("Luna")
        };

        // Display information and make sounds
        for (Animal animal : animals) {
            System.out.println(animal);  // Uses the overridden toString() method
            animal.makeSound();          // Polymorphic call to makeSound()
        }
    }
}

