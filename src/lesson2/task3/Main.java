package lesson2.task3;

public class Main {
  public static void main(String[] args) {

    Vehicle vehicle1 = new Vehicle();
    Vehicle vehicle2 = new Vehicle(4);
    Vehicle vehicle3 = new Vehicle(49, 90);
    Vehicle vehicle4 = new Vehicle(8,240,1430);
    Vehicle vehicle5 = new Vehicle(2,180,1780,"blue");

    System.out.println("task3.Vehicle 1: "+ vehicle1.toString());
    System.out.println("task3.Vehicle 2: "+ vehicle2.toString());
    System.out.println("task3.Vehicle 3: "+ vehicle3.toString());
    System.out.println("task3.Vehicle 4: "+ vehicle4.toString());
    System.out.println("task3.Vehicle 5: "+ vehicle5.toString());

  }

}
