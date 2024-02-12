public class Building {
    private String name;
    private Room [] rooms;
    private int roomCount = 0;

    public Building(String name){
        this.name = name;
        rooms = new Room [10];
    }

    public String getName(){
        return name;
    }

    public int getRoomCount(){
        return roomCount;
    }

    // method to add a room object to the array
    public void roomAdd(Room room){
        rooms[roomCount++] = room;
    }

    public void print(){
        System.out.println(name + rooms.toString());
    }


}
