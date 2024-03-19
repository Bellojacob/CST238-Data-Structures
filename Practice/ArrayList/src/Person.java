package Practice.ArrayList.src;

public class Person implements Comparable<Person>{
    private int heightInCentimeters;
    private String name;

    public Person(int heightInCentimeters, String name) {
        this.heightInCentimeters = heightInCentimeters;
        this.name = name;
    }

    public int getHeightInCentimeters() {
        return heightInCentimeters;
    }

    public void setHeightInCentimeters(int heightInCentimeters) {
        this.heightInCentimeters = heightInCentimeters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeet(){
        double temp = (heightInCentimeters * 1.0) / 30.48;
        int heightInFeet = (int)temp;
        return heightInFeet;
    }

    public int getInches(){
        double temp = (heightInCentimeters * 1.0) / 2.54;
        int heightInInches = (int)temp%12;
        return heightInInches;
    }

    public int getTotalInches(){
        double temp = (heightInCentimeters * 1.0) / 2.54;
        int heightInInches = (int)temp;
        return heightInInches;
    }

    public String toString(){
        return name + " (Height: " + getFeet() + "' " + getInches() + "\"" + ")";
    }

    public boolean equals(Person p){
        if (this.heightInCentimeters == p.heightInCentimeters){
            if (this.name.equals(p.name)){
                return true;
            }
        }
        return false;
    }


    @Override
    public int compareTo(Person o) {
        if (this.heightInCentimeters > o.heightInCentimeters){
            return 1;
        } else if (this.heightInCentimeters == o.heightInCentimeters) {
            return 0;
        } else {
        return -1;
    }
    }
}
