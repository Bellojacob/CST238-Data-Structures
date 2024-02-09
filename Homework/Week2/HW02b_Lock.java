import java.util.Scanner;
import java.util.Random;
/* Title: HW02b_Lock.java
 * Abstract: This program creates a lock object and store 3 random codes from 0-40, the user is then prompted to guess
 * and if the guess is too low or too high, then told which direction to head. When the user correct guesses all 3 codes
 * then print out all the guesses which will be held in an array and the guess count which is iterated everytime the
 * user makes an attempt.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 4 hours
 * Date: 02/5/2024
 */

// main class/file
public class HW02b_Lock {

    // Lock class
    public static class Lock {
        // lock attributes
        private int[] codes;
        // array to hold secret codes
        private int currentCode;
        // int for which code is being used currently
        private int[] allGuesses;
        // store all guesses in the array
        private int guessCount;
        // count the attempts of user guesses

        // constructor for Lock
        // take in 3 codes
        public Lock(int code1, int code2, int code3) {
            codes = new int[]{code1, code2, code3};
            currentCode = 0;
            guessCount = 0;
            allGuesses = new int[120];
        }

        // when ran return boolean if currentCode != 3
        // don't have to use an if statement
        public boolean isLocked() {
            return currentCode != 3;
        }

        // method to take in guess from user
        // store guess in allGuesses and increment guessCount

        public void guess(int guess) {
            //every guess is stored in the allGuesses array
            allGuesses[guessCount] = guess;
            //increment guessCount
            guessCount++;

            // conditional that says if guess == the current code being checked then tell the user "Correct!"
            // then go to the next code
            if (guess == codes[currentCode]) {
                System.out.println("Correct!");
                currentCode++;
            // if guess != currentCode then tell the to try higher or lower based on their input
            } else {
                if (guess < codes[currentCode])
                    System.out.println("Go up");
                else
                    System.out.println("Go down");
            }
        }

        // method that returns a STRING of all the user guesses
        public String guesses() {
            StringBuilder stringbuilder = new StringBuilder();

            for (int i = 0; i < guessCount; i++) {
                // until guessCount is done, append or add every guess in allGuesses are to a string
                stringbuilder.append(allGuesses[i]).append(" ");
            }

            // call the stringbuilder obj, return it using toString
            // need to use .trim() to get rid of the blanks
            return stringbuilder.toString().trim();
        }

        // toString method to print out the codes
        public String toString() {
            StringBuilder stringbuilder = new StringBuilder("The codes are: ");

            for (int code : codes) {
                stringbuilder.append(code).append(" ");
            }
            return stringbuilder.toString().trim();
        }

        // given main
        public static void main(String[] args) {
            Random r = new Random();
            Scanner in = new Scanner(System.in);
            Lock l = new Lock(r.nextInt(40) + 1,
                    r.nextInt(40) + 1,
                    r.nextInt(40) + 1);
            while (l.isLocked()) {
                int guess;
                do {
                    System.out.print("Enter guess: ");
                    guess = in.nextInt();
                } while (guess < 1 || guess > 40);
                l.guess(guess);
            }
            System.out.println(l);
            System.out.println(l.guessCount + " guesses: "  + l.guesses());
        }
    }
}