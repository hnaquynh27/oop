import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args){
        double radius, volume, surfaceArea;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        surfaceArea = 4 * Math.PI * radius * radius;
        volume = radius * radius * radius * 4 / 3;

        System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}
