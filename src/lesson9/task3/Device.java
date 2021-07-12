package lesson9.task3;

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
}

class Monitor{
  private int resolutionX;
  private int resolutionY;

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