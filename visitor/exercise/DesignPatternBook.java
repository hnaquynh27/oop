package visitor.exercise;

public class DesignPatternBook implements ProgramingBook {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getResource() {
        return "https://github.com/gpcodervn/Design−Pattern−Tutorial/";
    }

    public String getBestSeller() {
        return "The best seller of design pattern book";
    }

}
