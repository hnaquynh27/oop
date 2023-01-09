package Lab5ex2_2;

public class TestMain {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Tech", "ahtech@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "paul@nowhere.com", 'm');

        Book book = new Book("Java for dummies", authors, 19.99, 99);
        System.out.println(book);

        System.out.println("Author's name are: " + book.getAuthorNames());
    }
}