package visitor.exercise;

public class VisitorImpl implements Visitor {
    public void visit(BusinessBook book) {
        System.out.println(book.getPublisher());
    }

    public void visit(DesignPatternBook book) {
        System.out.println(book.getBestSeller());
    }

    public void visit(JavaCoreBook book) {
        System.out.println(book.getFavoriteBook());
    }


}
