package visitor.exercise;

public class JavaCoreBook implements ProgramingBook {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getResource() {
        return "https://github.com/gpcodervn/Java-Tutorial/";
    }

    public String getFavoriteBook() {
        return "The most favorite book of java core";
    }
}
