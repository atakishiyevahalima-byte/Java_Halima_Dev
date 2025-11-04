package OuterAndInner;

public class MainCalculator {
    public static void main(String[] args) {
       new Calculator().math();
    }
}

class Calculator {
    void math(){
        MathUtils mathUtils = new MathUtils();
        mathUtils.sum(2,3);
        mathUtils.multiply(5, 15);
    }
    class MathUtils{
        public void sum(int a, int b){
            System.out.println("Sum: " + (a + b));
        }
        public void multiply(int a, int b){
            System.out.println("Multiply: " + (a * b));
        }
    }
}