import java.util.Scanner;

import static java.lang.System.*;

public class InputValidation {
    public static void main(String[] args){
        int input;
        boolean isValid;
        isValid = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0-10 or 90-100: ");
        input = sc.nextInt();

        do{
            if (input >= 0 && input <= 10){
                isValid = true;
            } else if (input >= 90 && input <= 100){
                isValid = true;
            } else{
                out.println("Invalid input, try again...");
                System.out.println("Enter a number between 0-10 or 90-100: ");
                input = sc.nextInt();
            }
        }
        while (!isValid);
        out.println("You have entered " + input);

    }
}
