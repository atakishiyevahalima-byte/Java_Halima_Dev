package Homework;

public class Animal {
    String name;
    int age ;
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;
    void makeSound(){
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bob";
        dog.age = 2;
        dog.breed = "Shepherd";
        dog.makeSound();
        System.out.println("Info: ");
        System.out.println("Dog's name: " + dog.name);
        System.out.println("Dog's age: " + dog.age);
        System.out.println("Dog's breed: " + dog.breed);
    }
}
