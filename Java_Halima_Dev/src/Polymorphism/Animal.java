package Polymorphism;

public class Animal {
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is barking");
    }
}

class Duck extends Animal{
    @Override
    void sound(){
        System.out.println("Duck is ducking");
    }
}
