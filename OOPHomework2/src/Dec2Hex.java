import java.util.Scanner;

class Dec2Hex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int num = sc.nextInt();

        int rem;

        StringBuilder str = new StringBuilder();

        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (num > 0) {
            rem = num % 16;
            str.append(hex[rem]);
            num = num / 16;
        }
        str.reverse();
        System.out.println("Method 2: Decimal to hexadecimal: " + str);
    }
}