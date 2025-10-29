package Encapsulation;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Halima");
        System.out.println(person.getName());
        person.setSurname("Atakishiyeva");
        System.out.println(person.getSurname());
        person.setAge(11);
        System.out.println(person.getAge());
        person.setHeight(134.5);
        System.out.println(person.getHeight());
        person.setBalance(1000);
        System.out.println(person.getBalance());
        person.setEyeColor("Brown");
        System.out.println(person.getEyeColor());
    }
}
//class user e-mail or phone password card number год рождения name surname