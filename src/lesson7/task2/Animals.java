package lesson7.task2;

public enum Animals {
  GIRAFFE (10), WOLF(4), TIGER(7), ELEPHANT(30), SQUIRREL(2);

  int years;

  Animals(int years) {
    this.years = years;
  }

  @Override
  public String toString() {
    return "The animal " + name() + " is " + years + " old.";
  }
}

class Main{
  public static void main(String[] args) {
    Animals elephant = Animals.ELEPHANT;
    Animals wolf = Animals.WOLF;
    Animals tiger = Animals.TIGER;
    Animals giraffe = Animals.GIRAFFE;
    Animals squirrel = Animals.SQUIRREL;

    System.out.println(elephant);
    System.out.println(wolf);
    System.out.println(tiger);
    System.out.println(giraffe);
    System.out.println(squirrel);

  }
}