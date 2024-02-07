import java.util.Scanner;

public class HW02b_Lock {
    public class Lock {
        private int[] codes;
        private int currentCode;
        private int[] allGuesses;
        private int guessCount;
        private int code1;
        private int code2;
        private int code3;

        Lock(int code1, int code2, int code3) {
            this.code1 = code1;
            this.code2 = code2;
            this.code3 = code3;
            this.codes = new int[3];
            this.allGuesses = new int[120];

            codes[0] = code1;
            codes[1] = code2;
            codes[2] = code3;

            currentCode = 0;
            guessCount = 0;

        }

        public boolean isLocked() {
            if (currentCode != 3) {
                return true;
            }
            return false;
        }

        public void guess() {
            int userGuess;
            while ((userGuess = new Scanner(System.in).nextInt()) != code1) {
                System.out.println("Enter guess: ");
                allGuesses[guessCount++] = userGuess;
                if (userGuess > code1) {
                    System.out.println("Go down");
                } else if (userGuess < code1) {
                    System.out.println("Go up");
                }
            }
            System.out.println("Correct!");
        }
    }

    public static void main(String[] args) {
        Lock lock1 = new Lock(25, 45,67);
    }
}
