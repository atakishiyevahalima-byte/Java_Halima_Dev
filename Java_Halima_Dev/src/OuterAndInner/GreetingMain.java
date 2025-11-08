package OuterAndInner;

public class GreetingMain {
    public static void main(String[] args) {
       Greeting greeting = new Greeting();
       greeting.showMessage();

    }
}

class Greeting{
    void showMessage(){
        Message msg = new Message();
        msg.print();
    }
    class Message{
        void print(){
            System.out.println("Привет из локального класса!");
        }
    }
}