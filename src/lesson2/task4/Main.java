package lesson2.task4;

public class Main {
  public static void main(String[] args) {
    Vehicle vehicle1 = new Vehicle();
    Vehicle vehicle2 = new Vehicle(3);
    Vehicle vehicle3 = new Vehicle(4, 175);
    Vehicle vehicle4 = new Vehicle(5, 180, 1900);
    Vehicle vehicle5 = new Vehicle(6, 185, 2000, "white");

    System.out.println("Vehicle1: "+vehicle1.toString());
    System.out.println("Vehicle2: "+vehicle2.toString());
    System.out.println("Vehicle3: "+vehicle3.toString());
    System.out.println("Vehicle4: "+vehicle4.toString());
    System.out.println("Vehicle5: "+vehicle5.toString());

  }

}
