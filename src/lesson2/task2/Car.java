package lesson2.task2;

public class Car {
  int year;
  String color;

  Car(){
    this.year = 10;
    this.color = "red";
  }
  Car(int year){
    this.year = year;
    this.color = "brown";
  }
  Car (int year, String color){
    this.year = year;
    this.color = color;
  }
}
