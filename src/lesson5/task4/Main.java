package lesson5.task4;
//Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить
//значения на 1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
  public static void main(String[] args) {

    ArrayList<Integer> numberList = new ArrayList<>();

    for (int i = 0; i<25 ; i++ ){
      numberList.add(i);
    }
    ListIterator<Integer> iter = numberList.listIterator();

    while (iter.hasNext()){
      numberList.set(iter.nextIndex(), iter.nextIndex()+2);
      System.out.println(iter.next());
    }

  }

}
