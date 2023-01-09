import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args){
        double radius, diameter, circum, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");

        radius = sc.nextDouble();
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circum = 2.0 * Math.PI * radius;

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circum);
    }
}
