package AbstractMethods;

public class MainHero {
    public static void main(String[] args) {
        Warrior w = new Warrior();
        Archer a = new Archer();
        Mage m = new Mage();
        String[] list = {"Warrior", "Archer", "Mage"};
        System.out.println(list[0]);
        w.attack();
        System.out.println(list[1]);
        a.attack();
        System.out.println(list[2]);
        m.attack();
    }
}
abstract class Hero{
    abstract void attack();
}

class Warrior extends Hero{
    @Override
    void attack(){
        System.out.println("Attacks with a sword");
    }
}

class Archer extends Hero{
    @Override
    void attack(){
        System.out.println("Shoots a bow");
    }
}

class Mage extends Hero{
    @Override
    void attack(){
        System.out.println("Uses a spell");
    }
}