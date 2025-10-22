package Encapsulation;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double height;
    private int balance;
    private String eyeColor;

    // помогает показать его значение
    public String getName(){
         return name;
    }

    // помогает задать ему значение
    public void setName(String name){
         this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight (double height){
        this.height = height;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
