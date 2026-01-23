package homework;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] word = getStrings();
        Random randomNum = new Random();
        Scanner scanner = new Scanner(System.in);

        int correct = 0;
        int incorrect = 0;

        while (correct < 3 && incorrect < 3) {

            int stopIndex = randomNum.nextInt(word.length);
            String correctWord = word[stopIndex];

            for (int i = 0; i < stopIndex; i++) {
                IO.print(word[i] + " ");
            }

            String hidden = "-".repeat(correctWord.length());
            IO.println(hidden);

            IO.print("Please guess the next word: ");
            String guess = scanner.nextLine();

            if (guess.equals(correctWord)) {
                IO.println("Correct.");
                correct++;
            }
            else {
                IO.println("Incorrect, the correct word was: " + correctWord);
                incorrect++;
            }

            IO.println("Correct: " + correct + " --- Incorrect: " + incorrect);
            IO.println();
        }

        if (correct == 3) {
            IO.println("Great job, you remembered three words!");
        }
        else {
            IO.println("Uh oh...You forgot three words!");
        }

        scanner.close();
    }

    static String[] getStrings() {

        String sonnet =
                "Two households, both alike in dignity, " +
                        "In fair Verona, where we lay our scene, " +
                        "From ancient grudge break to new mutiny, " +
                        "Where civil blood makes civil hands unclean. " +
                        "From forth the fatal loins of these two foes " +
                        "A pair of star-cross’d lovers take their life; " +
                        "Whose misadventured piteous overthrows " +
                        "Do with their death bury their parents’ strife. " +
                        "The fearful passage of their death-mark’d love, " +
                        "And the continuance of their parents’ rage, " +
                        "Which, but their children’s end, nought could remove, " +
                        "Is now the two hours’ traffic of our stage; " +
                        "The which if you with patient ears attend, " +
                        "What here shall miss, our toil shall strive to mend.";

        return sonnet.split(" ");
    }
}
