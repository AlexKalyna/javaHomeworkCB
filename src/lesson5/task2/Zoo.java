package lesson5.task2;

import java.util.ArrayList;

public class Zoo {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();

    animals.add(0, "Elephant");
    animals.add(1, "Lion");
    animals.add(2, "Wolf");
    animals.add(3,"Bear");
    animals.add(4, "Giraffe");
    animals.add(5,"Tiger");
    animals.add(6, "Alligator");
    animals.add(7, "Zebra");

    for (int i = 0; i <8; i++){
      System.out.println("The animal number " + i + " is: "+ animals.get(i));
    }


  }
}
