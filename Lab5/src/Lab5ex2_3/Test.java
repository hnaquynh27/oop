package Lab5ex2_3;

import java.lang.reflect.AnnotatedArrayType;

public class Test {
    public static void main(String[] args) {
        Author au1 = new Author("Tan Ah Teck", "ahteck@nowhere . com");
        System.out.println(au1);

        au1.setEmail("ahteck@sm.com");
        System.out.println(au1);
        System.out.println("name is: " + au1.getName());
        System.out.println("email is: " + au1.getEmail());

        Book book1 = new Book("12345", "Java for dummies", au1, 8.8, 88);
        System.out.println(book1);
        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("qty is: " + book1.getQty());
        System.out.println("Author is: " + book1.getAuthor().getName());
        System.out.println("Author's email is: " + book1.getAuthor().getEmail());

    }
}
