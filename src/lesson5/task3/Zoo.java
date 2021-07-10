package lesson5.task3;
//Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.

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

    animals.remove("Wolf");
    animals.remove("Giraffe");
    animals.remove("Alligator");


    System.out.println("The length of array after deleting 3 elements is: " + animals.size() );


  }
}
