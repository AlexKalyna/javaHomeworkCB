package lesson2.task3;

public class Vehicle {
  int year;
  double speed;
  int weight;
  String color;

  public Vehicle() {
    this.year = 8;
    this.speed = 220;
    this.weight = 1111;
    this.color = "purple";
  }

  public Vehicle(int year) {
    this.year = year;

  }

  public Vehicle(int year, double speed) {
    this.year = year;
    this.speed = speed;

  }

  public Vehicle(int year, double speed, int weight) {
    this.year = year;
    this.speed = speed;
    this.weight = weight;
  }

  public Vehicle(int year, double speed, int weight, String color) {
    this.year = year;
    this.speed = speed;
    this.weight = weight;
    this.color = color;
  }

  @Override
  public String toString() {
    return "year - " + year + ", speed - " + speed + ", weight - " + weight + ", color - " + color;
  }
}
