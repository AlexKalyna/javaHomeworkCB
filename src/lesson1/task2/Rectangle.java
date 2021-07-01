package lesson1.task2;

public class Rectangle {
  private double side1, side2;

  Rectangle(double side1, double side2) {
    this.side1 = side1;
    this.side2 = side2;
  }

  public double areaCalculator() {
    return side1 * side2;
  }

  public double perimeterCalculator() {
    return 2 * (side1 + side2);
  }

  public double getArea() {
    return areaCalculator();
  }

  public double getPerimeter() {
    return perimeterCalculator();
  }

  public static void main(String[] args) {
    Rectangle r = new Rectangle(34,12);

    System.out.println("The area of the circle is: "+r.getArea());
    System.out.println("The perimeter of the circle is: "+r.getPerimeter());
  }


}
