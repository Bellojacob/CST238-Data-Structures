public class Car {
    String name;
    int year;
    int mpg;

    public Car(String name, int year, int mpg) {
        this.name = name;
        this.year = year;
        this.mpg = mpg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
