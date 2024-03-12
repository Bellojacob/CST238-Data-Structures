package Practice.Lab;

public class List {
    private static int DEFAULT_CAPACITY = 10;
    private int size;
    private int [] data;

    public List() {
        this.size = 0;
        this.data = new int[DEFAULT_CAPACITY];
    }

    public List(int capacity) {
        this.size = 0;
        this.data = new int[capacity];
    }

    //new constructor
    public List(int value, int repeats){
        this();
        int i = 0;
        while(i < repeats){
            append(value);

        }
    }


    // resize method
    public void resize(){
        int[] temp = new int[this.data.length * 2];
        // copy contents of this.size into temp
        for (int i=0; i < data.length; i++){
            temp[i] = this.data[i];
        }
        this.data = temp;
        System.out.println("The data array has been resized");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int item, int position) {
        if(size == data.length) {
            //System.out.println("** No space for list element **");
            resize();

        }

        if(position < 0 || position > size) {
            System.out.println("** Illegal location to insert " + position + " **");
            return;
        }

        // right shift
        for(int i = size; i > position; i--) {
            data[i] = data[i-1];
        }

        data[position] = item;
        size++;
    }

    public void remove(int position) {
        if(isEmpty()) {
            System.out.println("** Empty list - cannot remove **");
            return;
        }

        if(position < 0 || position >= size) {
            System.out.println("** Illegal location to remove " + position + " **");
            return;
        }

        // only uncomment for arrays of objects!
        // data[position] = null;

        for(int i = position; i < size - 1; i++) {
            data[i] = data[i+1];
        }

        size--;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Empty list");
            return;
        } else {
            System.out.print("List of size " + size + ": ");
        }

        for(int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int find(int value) {
        for(int i = 0; i < size; i++) {
            if(data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int sum() {
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += data[i];
        }
        return sum;
    }

    public void append(int value) {
        if(size == data.length) {
            resize();
        } else {
            data[size] = value;
            size++;
        }


    }

    public static void main(String[] args) {
        List l1 = new List();
        l1.display();
    }

}
