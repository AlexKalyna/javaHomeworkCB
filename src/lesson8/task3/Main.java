package lesson8.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
  public static void main(String[] args) throws Exception {

    Price[] prices = new Price[2];

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    for (int i = 0; i < prices.length; i++) {

      System.out.println("NameOfProduct = ");
      String name = reader.readLine();
      System.out.println("Shop_name = ");
      String shop_name = reader.readLine();
      System.out.println("Price = ");
      double price = Double.parseDouble(reader.readLine());


      prices[i] = new Price(name, shop_name, price);
    }

    for (int i = 0; i < prices.length; i++) {
      System.out.println(prices[i].toString());
    }


    System.out.println("Input shop_name:");
    String shop_name = reader.readLine();

    for (int i = 0; i < prices.length; i++) {
      String name = prices[i].shop_name;


      if (name.equals(shop_name)) {
        System.out.println(prices[i].toString());
      } else {
        throw new Exception();
      }
    }
  }
}