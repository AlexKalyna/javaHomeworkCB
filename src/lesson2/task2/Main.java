package lesson2.task2;

public class Main {
  public static void main(String[] args) {

    Car car1 = new Car();
    Car car2 = new Car(3);
    Car car3 = new Car(5, "yellow");

    System.out.println("Car1 "+"year: "+car1.year+", "+"color: "+car1.color);
    System.out.println("Car2 "+"year: "+car2.year+", "+"color: "+car2.color);
    System.out.println("Car3 "+"year: "+car3.year+", "+"color: "+car3.color);

  }

}
