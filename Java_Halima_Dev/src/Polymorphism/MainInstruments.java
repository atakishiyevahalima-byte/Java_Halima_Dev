package Polymorphism;

public class MainInstruments {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Drum drum = new Drum();

        instrument.playSound();
        guitar.playSound();
        piano.playSound();
        drum.playSound();
    }
}

class Instrument{
    void playSound(){
        System.out.println("Instrument makes a sound");
    }
}

class Guitar extends Instrument{
    @Override
    void playSound(){
        System.out.println("Guitar makes a sound");
    }
}

class Piano extends Instrument{
    @Override
    void playSound(){
        System.out.println("Piano makes a sound");
    }
}

class Drum extends Instrument{
    @Override
    void playSound(){
        System.out.println("Drum makes a sound");
    }
}
