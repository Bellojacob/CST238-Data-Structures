public class Resizing {
    // we are going to resize a list
    private String[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public Resizing(){
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    // now let's add a method to add items to the list

    public void insert(String s, int pos){
        // check if list is full
        if (size >= data.length){
            System.out.println("List is full");
            resize();
        }

        // now check if the position is valid
        if (pos > size || pos < 0){
            System.out.println("Invalid Position");
        }

        // if everything is good then add element and shift everything else to the right
        for (int i = size; i > pos; i--){
            data[i] = data[i-1];
        }
        data[pos] = s;
        size++;
    }

    // display method

    public void display(){
        for (int i = 0; i < size; i++){
            System.out.println(data[i]);
        }
    }

    public void fillList(){
        for (int i = 0; i < data.length; i++){
            this.insert(i+ " Hello", i);
        }
    }

    public void resize(){
        int newSize = data.length * 2;
        System.out.println("Resizing from " + data.length + " to " + newSize);
        String[] newData = new String[newSize];
        for (int i=0; i < data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public static void main(String[] args) {
        Resizing list = new Resizing();
        list.fillList();

        list.display();

        list.insert("Hi", 10);

//        System.out.println(list.size);
    }
}
