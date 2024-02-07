import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// assignment file/class name
public class HW02a_Student {

    // private class Student
    private static class Student {
        // initialize private attributes name, id, and array quizScores
        private String name;
        private int id;
        private double[] quizScores;

        // constructor
        public Student(String name, int id){
            // set all values of the object to be equal to the values passed in the parameter
            this.name = name;
            this.id = id;
            this.quizScores = new double[5];
        }

        // set array values
        public void setQuizScores(double[] scores) {
            for (int i = 0; i < 5; i++) {
                this.quizScores[i] = scores[i];
            }
        }

        // set the sum to 0, then find average and save as the sum
        public double getAverage(){
            double lowestNum = 999999999;
            for (int i = 0; i < quizScores.length; i++){
                if (quizScores[i] < lowestNum){
                    lowestNum = quizScores[i];
                }
            }

            double sum = 0;
            for (int i = 0; i < quizScores.length; i++){
                sum += quizScores[i];
            }
            sum -= lowestNum;
            return sum / 4;
        }

        // toString method to return values of attributes
        public String toString(){
            return name + " (" + id + "): " + getAverage();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // get filename
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input filename: ");
        String filename = scanner.nextLine();
        File file = new File(filename);
        Scanner fs = new Scanner(file);

        // expected output
        System.out.println("--------------------------------------------------");
        System.out.println("Course Report: Quiz Average");
        System.out.println("--------------------------------------------------");

        // while there is a next line
        while (fs.hasNextLine()) {
            // save entire line of txt file as a String file
            String line = fs.nextLine();

            // check if line == STOP, and if it does break out of the while loop
            if (line.equals("STOP")){
                break;
            }
            // make an array to hold each part of the line
            String[] parts = line.split(" ");
            // if parts is shorter than 7 for whatever reason, or equals STOP then continue
            if (parts.length < 7 || parts[0].equals("STOP")){
                continue;
            }
            // username should be the first item in the array
            String name = parts[0];
            // their id number should be the second part
            // covert the string value of id into an int
            int id = Integer.parseInt(parts[1]);

            // init an array to hold quiz scores
            double[] scores = new double[5];
            // loop through each quiz score in parts array and add it to scores array
            for (int i = 0; i < 5; i++) {
                scores[i] = Double.parseDouble(parts[i + 2]);
            }

            // init a student object passing the name and id from the txt file
            Student student = new Student(name, id);
            // call our setQuizScores method on our object
            student.setQuizScores(scores);

            // print out the values for our student
            System.out.println(student);
        }

        System.out.println("--------------------------------------------------");

        fs.close();
    }
}




