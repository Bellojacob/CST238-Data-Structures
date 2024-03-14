// using Comparable Interface
// Car implements Comparable<Car>
public class Car implements Comparable<Car> {
    String model;
    int year;
    String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "model=" + model  + ", year=" + year + ", color=" + color;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // method to compare car years
    public int compareTo(Car o) {
        // if our Car year is greater than  > the Car year that is passed through, then return 0
        // Else if our Car year is less than  < the Car year that is passed through, then return 1
        // if it's neither, then return -1 meaning it is negative
        if (this.getYear() == o.getYear()){
            return 0;
        } else if (this.getYear() > o.getYear()) {
            return 1;
        } else return -1;
    }
}
