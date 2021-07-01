package lesson1.task4;

import java.util.Arrays;

public class Computer {
  int number;
  Computer(int number){
    this.number = number;
  }

  public static void main(String[] args) {
    Computer[] computers = new Computer[5];


    for (int i = 0; i < computers.length; i++) {
      computers[i] = new Computer(i);
    }
    System.out.println(Arrays.toString(computers));
  }
  @Override
  public String toString() {
    return "Computer{" +
            "number=" + number +
            '}';
  }
}

