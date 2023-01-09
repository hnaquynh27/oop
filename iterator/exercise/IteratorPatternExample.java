package iterator.exercise;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Iterator iterator = catalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Product Name: " + iterator.next());
        }
    }
}
