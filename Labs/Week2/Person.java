package Labs.Week2;

public class Person {
    private int age;
    private double weight;
    private double height;
    private String name;


    Person(String name,int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public String toString(){
        return name + " " + age + " " + weight+ " " + height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person jacob = new Person("Jacob", 21, 190, 6.0);
        System.out.println(jacob.getName() + " is " + jacob.getAge() + ".");
        System.out.println(jacob.getWeight() + " is Jacob's weight.");


    }
}
