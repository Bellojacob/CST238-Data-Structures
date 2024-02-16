/* Title: Student.java
 * Abstract: The class student is a blueprint to create a student object. The student has two attributes, name and id.
 * The constructor sets these attributes. Then we have setters and getters and a toString to print information. Lastly,
 * we have an equals boolean methods which checks if the student id presented equals the current student.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 1 hour
 * Date: 02/5/2024
 */
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return name + " " + id;
    }

    public boolean equals(Student student){
        return this.id == student.id;
    }


}
