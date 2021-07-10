package lesson4.task2;
//Создайте класс AbstractHandler.
//В теле класса создать методы void open(), void create(), void change(), void save().
//Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
//Написать программу, которая будет выполнять определение документа и для каждого формата должны
//быть методы открытия, создания, редактирования, сохранения определенного формата документа.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

     String documentFormat = "";
    Scanner input = new Scanner(System.in);

    while (true)
    {
      System.out.println("Please, enter your document format: ");
      documentFormat = input.next();

      if(documentFormat.equals("DOC") || documentFormat.equals("doc")){
        AbstractHandler doc = new DOCHandler();
        doc.open();
        doc.create();
        doc.change();
        doc.save();
      } else if (documentFormat.equals("XML") || documentFormat.equals("xml")){
        AbstractHandler xml = new XMLHandler();
        xml.open();
        xml.create();
        xml.change();
        xml.save();
      }
      else if (documentFormat.equals("TXT")|| documentFormat.equals("txt")) {
        AbstractHandler txt = new TXTHandler();
        txt.open();
        txt.create();
        txt.change();
        txt.save();
      }
       else
        System.out.println("Failed format!");
      break;
    }

  }
}
