public class Room {
    private int floor;
    private int number;
    private int capacity;


    public Room(int floor, int number, int capacity ){
        this.floor = floor;
        this.number = number;
        this.capacity = capacity;
    }

    public int getFloor(){
        return floor;
    }

    public int getNumber(){
        return number;
    }

    public int getCapacity(){
        return capacity;
    }

    public String toString(){
        return floor + "\t" + number + "\t" + capacity;
    }
}
