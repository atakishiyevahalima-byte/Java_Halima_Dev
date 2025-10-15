package Polymorphism;

public class MainAnimals {
    public static void main(String[] args) {
        Animal animals = new Animal();
        Dog dog1 = new Dog();
        Duck duck1 = new Duck();

        animals.sound();
        dog1.sound();
        duck1.sound();
    }
}
