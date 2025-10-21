package AbstractMethods;

public class MainRide {
    public static void main(String[] args) {
        RollerCoaster rc = new RollerCoaster();
        FerrisWheel fw = new FerrisWheel();
        HauntedHouse h = new HauntedHouse();
        rc.startRide();
        String[] list = {"Roller coaster", "Ferris wheel", "Haunted house"};
        System.out.println(list[0]);
        rc.enjoy();
        System.out.println(list[1]);
        fw.enjoy();
        System.out.println(list[2]);
        h.enjoy();
    }
}

abstract class Ride{
    void startRide(){
        System.out.println("Attraction starts ride");
    };
    abstract void enjoy();
}
class RollerCoaster extends Ride{
    @Override
    void enjoy(){
        System.out.println("Roller coaster has extreme");
    }
}

class FerrisWheel extends Ride{
    @Override
    void enjoy(){
        System.out.println("Ferris wheel is on top");
    }
}

class HauntedHouse extends Ride{
    @Override
    void enjoy(){
        System.out.println("Haunted house scary");
    }
}