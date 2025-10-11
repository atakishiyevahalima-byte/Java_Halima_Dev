package ClassesAndMethods;

public class Car {
  String  brendName;
  String modelName;
  String color;
  String maxSpeed;
  double price;

  void car_information(){
      System.out.println("Brend name is " + brendName);
      System.out.println("Model name is " + modelName);
      System.out.println("Color is " + color);
      System.out.println("Max speed is" + maxSpeed);
      System.out.println("Price is " + price);
  }

  void tornOnCar(){
      System.out.println("Машина завелась");
  }

}
