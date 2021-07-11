package lesson6.task2;

import sun.lwawt.macosx.CPrinterDevice;

//Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс
//Wheel и Door, которые также должны содержать метод print. Создайте экземпляры
// классов Wheel и Door.
public class Vehicle {

  void print(){

  }
  class Wheel{
    void print (){
      System.out.println("Nested class Wheel");
    }
  }
  class Door{
    void print(){
      System.out.println("Nested class Door");
    }
  }
}
class Main {
  public static void main(String[] args) {
    Vehicle.Wheel wheel = new Vehicle().new Wheel();
    Vehicle.Door door = new Vehicle().new Door();

    wheel.print();
    door.print();
  }
}
