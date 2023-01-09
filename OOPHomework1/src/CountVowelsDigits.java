import java.util.Scanner;

public class CountVowelsDigits {
    static void countCharacterType(String str) {
        int vowels = 0, digits = 0;
        double length = str.length();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u')
                    vowels++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            }
        }
        double percentOfVowels = vowels / length * 100.0;
        double percentOfDigits = digits / length * 100.0;
        System.out.println("Number of vowels: " + vowels + " (" + percentOfVowels + "%)");
        System.out.println("Digit: " + digits + " (" + percentOfDigits + "%)");
    }

    // Driver function.
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        countCharacterType(str);
    }
}

