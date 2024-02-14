package hw3;

public class Course {
    // Course attributes
    private String title;
    private int number;
    private String instructorName;
    private Student[] roster;
    private int enrolledStudents;
    private final int LIST_CAPACITY = 10;

    // constructor
    public Course(String title, int number, String instructorName){
        this.title = title;
        this.number = number;
        this.instructorName = instructorName;
        roster = new Student[LIST_CAPACITY];
    }

    //getter methods
    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    public String getInstructorName() {
        return instructorName;
    }
    //toString Method
    public String toString(){
        return title + " " + number + " " + instructorName + " " + enrolledStudents;
    }

    // compares the title and number
    public boolean equals(Course course){
        return number == course.number && title.equals(course.title);
    }

    // add method
    public boolean add(Student s){
        for (int i = 0; i < enrolledStudents; i++) {
            if (roster[i].getId() == s.getId()) {
                return false;
            }
        }
        roster[enrolledStudents++] = s;
        return true;
    }
    // method to remove student and shift remaining students to the left if necessary, lower enrolledStudents, and return true.
    // if student not enrolled, return false
    public boolean remove(Student s){
        // loop through every student
        for (int i= 0; i < enrolledStudents; i++){
            if (roster[i].getId() == s.getId()){
                for (int j = i; j < enrolledStudents - 1; j++) {
                    roster[j] = roster[j + 1];
                }
                // Nullify the last student since it's now a duplicate
                roster[enrolledStudents - 1] = null;
                enrolledStudents--;
                return true;
            }
        }
        return false;
    }

    // implement a print method that prints all the information like title, number, instructor, enrollment, and then the
    // students in the course
    public void print(){
        StringBuilder sb = new StringBuilder();
        sb.append("Course Title: ").append(title).append("\nCourse Number: ").append(number).append("\nInstructor: ")
                .append(instructorName).append("\nEnrollment: ").append(enrolledStudents);

        for (int i = 0; i < enrolledStudents; i++){
            sb.append("\n").append("\tName: " + roster[i].getName() + " - ID: " + roster[i].getId());
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Course c1 = new Course("Intro To Everything", 123, "Dr. Gross");
        Student s1 = new Student("Jacob", 2002);
        Student s2 = new Student("Eddie", 1994);
        Student s3 = new Student("Sofia", 2017);
        c1.add(s1);
        c1.add(s2);
        c1.add(s3);
        c1.remove(s1);
        c1.print();
    }
}
