public class Main {
    public static void main(String[] args) {
        String s = "Nguyen Van An";

        String s1, s2;

        s = s.trim();

        for (int i = 0; i < s.length(); i++) {

            s1 = s.substring(i, i + 1);

            if (s1.equals(" ")) {

                s1 = s.substring(i + 1, i + 2);

                if (s.equals(" ")) continue;

                else s2 = s2 + s.substring(i, i + 1);

            } else s2 = s2 + s1;

        }

        System.out.print(s2);
    }
}
