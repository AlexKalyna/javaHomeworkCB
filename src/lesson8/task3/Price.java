package lesson8.task3;

public class Price {

  String name;
  String shop_name;
  double price;

  public Price(String name, String shop_name, double price) {
    this.name = name;
    this.shop_name = shop_name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "NameOfProduct = " + this.name + "; Shop_name = " + this.shop_name + "; Price = " + this.price;
  }
}
