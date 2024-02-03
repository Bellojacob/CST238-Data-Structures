import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class HW02a_Student{
    public static void main(String[] args) throws FileNotFoundException {
        Student tom = new Student("Tom", "1000");
        tom.quizScores();


    }

    private static class Student {
        String name;
        String id;
        double quiz1;
        double quiz2;
        double quiz3;
        double quiz4;
        double quiz5;

        Student(String name, String id){
            this.name = name;
            this.id = id;
        }

        void quizScores() throws FileNotFoundException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter input file name: ");
            String userFile = scanner.nextLine();

            FileReader read = new FileReader(userFile);
            Scanner file = new Scanner(read);
            double[] quizScoresArray = new double[30];

            // Skip the first two tokens (name and id)
            if (file.hasNext()) file.next();
            if (file.hasNext()) file.next();

            for (int i = 0; i < 5; i++) {
                if (file.hasNextDouble()) {
                    quizScoresArray[i] = file.nextDouble();
                }
            }
            for (int i = 0; i < quizScoresArray.length; i++){
                System.out.println(quizScoresArray[i]);
            }
            averageScore(quizScoresArray);
        }

        void averageScore(double[] quizScoresArray){
            // find the lowest score
            double lowestScore = quizScoresArray[0];

            for (int i = 1; i < quizScoresArray.length; i++){
                if (quizScoresArray[i] < lowestScore){
                    lowestScore = quizScoresArray[i];
                }
            }
            System.out.println("The lowest score is " + lowestScore);

            // total up all the scores in the array
            // then subtract the lowest score
            // then average the scores out by 4
            // so basically knock off the lowest score

            double sum = 0;
            for (int i = 0; i < quizScoresArray.length; i++){
                sum += quizScoresArray[i];
            }

            System.out.println("The sum is " + sum);
            double newSum = sum - lowestScore;
            double quizAverage = newSum/4;
            System.out.println("The average quiz score is: " + quizAverage);
        }

        public String toString(){
            return name + " " + id + " " + quiz1 + " " + quiz2 + " " + quiz3 + " " + quiz4 + " " + quiz5;
        }
    }
}

