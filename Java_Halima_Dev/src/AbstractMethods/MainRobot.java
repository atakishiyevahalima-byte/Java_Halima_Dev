package AbstractMethods;

public class MainRobot {
    public static void main(String[] args) {
        CleanerBot clean = new CleanerBot();
        ChefBot chef = new ChefBot();
        GuardBot guard = new GuardBot();
        clean.sayHello();
        chef.sayHello();
        guard.sayHello();
        String[] names = {"Cleaner robot", "Chef robot", "Guard robot"};
        System.out.print(names[0] + ": ");
        clean.doTask();
        System.out.print(names[1] + ": ");
        chef.doTask();
        System.out.print(names[2] + ": ");
        guard.doTask();
    }
}

abstract class Robot {
    void sayHello(){
        System.out.println("Hello!");
    }
    abstract void doTask();
}

class CleanerBot extends Robot{
    @Override
    void doTask(){
        System.out.println("Cleaning the room");
    }
}

class ChefBot extends Robot {
    @Override
    void doTask(){
        System.out.println("Cooking the food");
    }
}

class GuardBot extends Robot{
    @Override
    void doTask(){
        System.out.println("Guard the house");
    }
}
