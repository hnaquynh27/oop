package decorator.exercise.icecream;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream vanillaIceCreamWithHoney = new HoneyToppingDecorator(new VanillaIceCream());
        System.out.println(vanillaIceCreamWithHoney.getDescription());

        IceCream strawberryCreamWithNuts = new NutsToppingDecorator(new StrawberryIceCream());
        System.out.println(strawberryCreamWithNuts.getDescription());

        IceCream chocolateIceCreamWithHoneyAndNuts = new HoneyToppingDecorator(new NutsToppingDecorator(new ChocolateIceCream()));
        System.out.println(chocolateIceCreamWithHoneyAndNuts.getDescription());
    }
}
