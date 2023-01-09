package factorymethod.excerise;

public class CallingClass {
    public static void main(String[] args) {
        try {
            FruitFactory factory = new FruitFactory();

            Fruit fruit = factory.provideFruit("apple");
            fruit.produceJuice();

            fruit = factory.provideFruit("orange");
            fruit.produceJuice();

            fruit = factory.provideFruit("grape");
            fruit.produceJuice();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
