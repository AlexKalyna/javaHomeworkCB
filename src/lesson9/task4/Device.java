package lesson9.task4;

import java.sql.SQLOutput;
import java.util.Objects;

public class Device {
  private String manufacturer;
  private float price;
  private String serialNumber;

  public Device(String manufacturer, float price, String serialNumber) {
    this.manufacturer = manufacturer;
    this.price = price;
    this.serialNumber = serialNumber;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  @Override
  public String toString() {
    return "Device: " + "manufacturer = " + getManufacturer() + ", " + "price = " +
            getPrice() + ", " + "serialNumber = " + getSerialNumber();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Device device = (Device) o;
    return Float.compare(device.price, price) == 0 &&
            manufacturer.equals(device.manufacturer) &&
            serialNumber.equals(device.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufacturer, price, serialNumber);
  }
}

class Monitor extends Device{
  private int resolutionX;
  private int resolutionY;

  public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
    super(manufacturer, price, serialNumber);
    this.resolutionX = resolutionX;
    this.resolutionY = resolutionY;
  }

  public int getResolutionX() {
    return resolutionX;
  }

  public void setResolutionX(int resolutionX) {
    this.resolutionX = resolutionX;
  }

  public int getResolutionY() {
    return resolutionY;
  }

  public void setResolutionY(int resolutionY) {
    this.resolutionY = resolutionY;
  }

  @Override
  public String toString() {
    return "Monitor: " + "manufacturer = " + getManufacturer() + ", " + "price = " +
            getPrice() + ", " + "serialNumber = " + getSerialNumber() + ", " +
            "X = " + resolutionX +", " + "Y = " + resolutionY;
  }

}

class EthernetAdapter{
  private int speed;
  private String mac;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

}

class Main{
  public static void main(String[] args) {
    Device mouse = new Device("HP", 25, "ION345433");
    Device mouse1 = new Device("HP", 25, "ION345433");
    Device mouse2 = mouse;

    Device monitor = new Monitor("Apple", 2550, "NR1222333",
            2550, 1280);
    Device monitor1 = new Monitor("Berry", 2550, "NR1222333",
            2550, 1280);

    System.out.println("------------- Equals ----------------");
    System.out.println(mouse.equals(mouse1));
    System.out.println(mouse.equals(mouse2));
    System.out.println("--------------------------------------");
    System.out.println(mouse.equals(monitor));
    System.out.println(monitor.equals(monitor1));
    System.out.println("------------- Hash Code --------------");
    System.out.println(mouse.hashCode());
    System.out.println(mouse1.hashCode());
    System.out.println(mouse2.hashCode());
    System.out.println("--------------------------------------");
    System.out.println(monitor.hashCode());
    System.out.println(monitor1.hashCode());
  }
}
