import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String str;
        char character;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        str = sc.nextLine();

        System.out.println("The characters in the string is: ");
        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            System.out.print(character + " ");
        }
        System.out.println();
        System.out.println("The numbers of characters in the string is: " + countWords(str));
    }

    static int countWords(String input) {
        if (input == null) {
            return - 1;
        }
        char[] characters = input.toCharArray();

        return characters.length;
    }
}
