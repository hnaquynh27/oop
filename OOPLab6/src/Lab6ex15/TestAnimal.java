package Lab6ex15;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Top");
        System.out.println(animal1.toString());

        Mamal animal2 = new Mamal("Tep");
        System.out.println(animal2.toString());

        Cat animal3 = new Cat("Tom");
        animal3.greets();
        System.out.println(animal3.toString());

        Dog animal4 = new Dog("Beo");
        Dog animal5 = new Dog("Miu");
        System.out.println(animal4.toString());
        animal4.greets();
        animal4.greets(animal5);
    }
}
