package lesson2.task4;

public class Vehicle {

  int year;
  double speed;
  int weight;
  String color;

  public Vehicle() {
    this.year = 1;
    this.speed = 100;
    this.weight = 1000;
    this.color = "blue";
  }

  public Vehicle(int year) {
    this.year = year;
  }

  public Vehicle(int year, double speed) {
    this(year);
    this.speed = speed;
  }

  public Vehicle(int year, double speed, int weight) {
    this(year, speed);
    this.weight = weight;
  }

  public Vehicle(int year, double speed, int weight, String color) {
    this(year, speed, weight);
    this.color = color;
  }

  @Override
  public String toString() {
    return "year - " + year + ", speed - " + speed + ", weight - " + weight + ", color - " + color;
  }
}

