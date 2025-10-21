package AbstractMethods;

public class MainSpaceShip {
    public static void main(String[] args) {
        CargoShip cs = new CargoShip();
        FighterShip fs = new FighterShip();
        ExplorerShip es = new ExplorerShip();
        System.out.println("Cargo ship");
        cs.fly();
        System.out.println("Fighter ship");
        fs.fly();
        System.out.println("Explorer ship");
        es.fly();
    }
}

abstract class SpaceShip{
    abstract void fly();
}

class CargoShip extends SpaceShip{
    @Override
    void fly(){
        System.out.println("Transports goods");
    }
}

class FighterShip extends SpaceShip{
    @Override
    void fly(){
        System.out.println("Attacks enemies");
    }
}
class ExplorerShip extends SpaceShip{
    @Override
    void fly(){
        System.out.println("Explores planets");
    }
}