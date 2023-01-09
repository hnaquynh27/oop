public class CardsSeparate {
    static String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    static String[] types = {"Co", "Ro", "Bich", "Nhep"};

    public static void main(String[] args) {
        int N = 4;
        int game = 8;
        inputCard(game, N);
    }

    static void inputCard(int game, int N) {
        int size = num.length * types.length;
        String[] cards = new String[size];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < types.length; j++) {
                cards[types.length * i + j] = num[i] + types[j];
            }
        }

        for (int i = 0; i < size; i++) {
            int random = (int) (Math.random() * (size - i));
            String temp = cards[random];
            cards[random] = cards[i];
            cards[i] = temp;
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i * game; count < game; j++) {
                System.out.printf("%1$s ", cards[j]);
                count++;
            }
            System.out.println();
        }
    }
}