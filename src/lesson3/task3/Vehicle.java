package lesson3.task3;
//Создать класс Vehicle.
//        В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//        выпуска).
//        Создайте 3 производных класса Plane, Саг и Ship.
//        Для класса Plane должна быть определена высота и количество пассажиров.
//        Для класса Ship – количество пассажиров и порт приписки.
//        Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
public class Vehicle {

  double price, speed;
  int year;

  public Vehicle(double price, double speed, int year) {
    this.price = price;
    this.speed = speed;
    this.year = year;
  }
  public Vehicle(){}

  void getInfo(){
    System.out.println("Price: " + price + " $" + "\nSpeed: " + speed + " km/h" + "\nYear: " + year);
    System.out.println("---------------------------------------------------------");
  }
}

class Car extends Vehicle{

  public Car(double price, double speed, int year) {
    super(price, speed, year);
  }
}

class Plane extends Vehicle{
  int passengers;
  double height;

  public Plane(double price, double speed, int year, double height, int passengers) {
    super(price,speed,year);
    this.height = height;
    this.passengers = passengers;
}

  @Override
  void getInfo() {
    System.out.println("Price: " + price + " $" + "\nSpeed: " + speed + " km/h" + "\nYear: " + year
    + "\nFly Height: " + height + " feet" + "\nAmount of passengers: " + passengers);
    System.out.println("---------------------------------------------------------");
  }
}

class Ship extends Vehicle{
  int passengers;
  String port;

  public Ship(double price, double speed, int year, int passengers, String port) {
    super(price, speed, year);
    this.passengers = passengers;
    this.port = port;
  }

  @Override
  void getInfo() {
    System.out.println("Price: " + price + " $" + "\nSpeed: " + speed + " km/h" + "\nYear: " + year
            + "\nPort: " + port + "\nAmount of passengers: " + passengers);
    System.out.println("---------------------------------------------------------");
  }
}

class Main{
  public static void main(String[] args) {
    Vehicle car = new Car(7000, 180, 2013);
    Vehicle plane = new Plane(8000000, 600, 2000, 38000, 120);
    Vehicle ship = new Ship(6000000, 40, 2007, 30, "Adelaide");

    System.out.println("The information about the car: ");
    car.getInfo();

    System.out.println("The information about the plane: ");
    plane.getInfo();

    System.out.println("The information about the ship: ");
    ship.getInfo();

  }
}


