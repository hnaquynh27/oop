import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    private final String[] words = {
            "testing", "hello", "world", "template", "java",
            "complete", "computer", "dominate", "university",
            "java", "difficult", "cry", "hate",
            "access", "controller", "fall", "beautiful", "homesick"
    };

    private String secretWord;

    private boolean[] secretWordMatches;

    public static void main(String[] args) {
        WordGuess aWordGuess = new WordGuess();
        aWordGuess.setSecretWord();
        aWordGuess.runGame();
    }

    private void setSecretWord(String word) {
        secretWord = word;
    }

    private void setSecretWord() {
        Random rand = new Random();
        secretWord = words[rand.nextInt(words.length - 1)];
    }

    private String getSecretWord() {
        return secretWord;
    }

    private String getTrialWordWithMatches() {
        StringBuilder str = new StringBuilder();
        for (int idx = 0; idx < secretWord.length(); idx++) {
            str.append((secretWordMatches[idx] ? secretWord.charAt(idx) : '_'));
        }
        return str.toString();
    }


    private void checkTrialWord(char ch) {
        for (int idx = 0; idx < secretWord.length(); idx++) {
            if (secretWordMatches[idx]) {
                continue;
            }
            secretWordMatches[idx] = secretWord.charAt(idx) == ch;
        }
    }

    private void runGame() {
        Scanner in = new Scanner(System.in);
        secretWordMatches = new boolean[secretWord.length()];
        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = (in.hasNext()) ? in.next() : "";

            trials++;

            if (trialWord.length() < 1) {
                continue;
            }

            if (trialWord.length() == 1) {
                checkTrialWord(trialWord.charAt(0));
                trialWord = getTrialWordWithMatches();
                System.out.printf("Trail %1$d: %2$s\n", trials, trialWord);
            }

            if (trialWord.equals(secretWord)) {
                System.out.printf("Trail " + trials + " : Congratulation!");
                break;
            }
        }
        System.out.printf("You got in %d trials\n", trials);
    }
}