package lesson1.task3;

public class Book {
  public static void main(String[] args) {

    Author author = new Author();
    Title title = new Title();
    Content content = new Content();

    author.setAuthor("Герберт Шилдт");
    title.setTitle("Java 8. Руководство для начинающих.");
    content.setContent("Шестое издание Герберта Шилдта обновленное с учетом всех новинок... ");

    author.show();
    title.show();
    content.show();
  }

}
