package factorymethod.excerise;

public class FruitFactory {
    Fruit provideFruit(String fruit) throws Exception {
        return switch (fruit) {
            case "apple" -> new Apple();
            case "banana" -> new Banana();
            case "orange" -> new Orange();
            default -> throw new Exception("No matching fruit.");
        };
    }
}
