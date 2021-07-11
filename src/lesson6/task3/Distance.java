package lesson6.task3;

import java.util.Scanner;

class Distance {
 public static class Converter {
  static void metersToKilometers(){
    double value;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter converted value in meters: ");
      value = input.nextDouble();
      value = value / 1000;
      System.out.println("The result is " + value + " km");
   }
   static void kilometersToMiles(){
     double value;
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter converted value in kilometers: ");
     value = input.nextDouble();
     value = value * 0.621371;
     System.out.println("The result is " + value + " miles");
   }
  }
}
class Main{
  public static void main(String[] args) {
    Distance.Converter.metersToKilometers();
    Distance.Converter.kilometersToMiles();
  }
}