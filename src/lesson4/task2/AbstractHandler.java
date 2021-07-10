package lesson4.task2;

public abstract class AbstractHandler {

  abstract void open();
  abstract void  create();
  abstract void  change();
  abstract void save();

}

class XMLHandler extends AbstractHandler{
  @Override
  void open() {
    System.out.println("Open XML document");
  }

  @Override
  void create() {
    System.out.println("Create XML document");
  }

  @Override
  void change() {
    System.out.println("Change XML document");
  }

  @Override
  void save() {
    System.out.println("Save XML document");
  }
}
class TXTHandler extends AbstractHandler{

  @Override
  void open() {
    System.out.println("Open TXT document");
  }

  @Override
  void create() {
    System.out.println("Create TXT document");
  }

  @Override
  void change() {
    System.out.println("Change TXT document");
  }

  @Override
  void save() {
    System.out.println("Save TXT document");
  }
}
class DOCHandler extends AbstractHandler{

  @Override
  void open() {
    System.out.println("Open DOC document");
  }

  @Override
  void create() {
    System.out.println("Create DOC document");
  }

  @Override
  void change() {
    System.out.println("Change DOC document");
  }

  @Override
  void save() {
    System.out.println("Save DOC document");
  }
}

