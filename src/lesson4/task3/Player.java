package lesson4.task3;
//Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() /
//void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//Написать программу, которая выполняет проигрывание и запись.

import java.util.Scanner;

interface Playable {
  void play();
  void pause();
  void stop();
}

interface Recordable {
  void record();
  void pause();
  void stop();
}

public  class Player implements Playable,Recordable {
  @Override
  public void play() {
    System.out.println("File is playing");
  }

  @Override
  public void record() {
    System.out.println("File is recording");
  }

  @Override
  public void pause() {
    System.out.println("Pause");
  }

  @Override
  public void stop() {
    System.out.println("Stop");
  }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  String playerAction = "";
  System.out.println("Enter player action ('G' - play, 'P' - pause, 'S' - stop, 'R' - record: ");

  playerAction = input.next();

    if (playerAction.equals("G") || playerAction.equals("g")) {
      Player mp3 = new Player();
      mp3.play();

    } else if (playerAction.equals("P") || playerAction.equals("p")) {
      Player mp3 = new Player();
      mp3.pause();

    } else if (playerAction.equals("S") || playerAction.equals("s")) {
      Player mp3 = new Player();
      mp3.stop();

    } else if (playerAction.equals("R") || playerAction.equals("r")) {
      Player mp3 = new Player();
      mp3.record();

    } else System.out.println("Error!");
  }
}






