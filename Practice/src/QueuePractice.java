public class QueuePractice {
    // queues are like a line
    // it is First In, First Out
    // the front elements are first in line
    // the back elements are last in line

    // following methods are in a queue
    // adding "Enqueue" with a value
    // removing "Dequeue"
    // getting the front value "Front"
    // displaying everything "Display"

    private final int CAPACITY = 128;
    private int[] data;
    private int front;
    private int back;

    // constructor
    public QueuePractice(){
        data = new int[CAPACITY];
        front = 0;
        back = 0;
    }

    // isEmpty method
    public boolean isEmpty(){
        // our queue is empty if front == back
        return front == back;
    }

    // enqueue method
    public void enqueue(int value){
        int newBack = (back + 1) % data.length;
        if (newBack != front){
            data[back] = value;
            back = newBack;
        } else {
            System.out.println("Queue Full");
        }
    }

    public void dequeue(){
        if (!isEmpty()){
            front = (front + 1) % data.length;

        } else {
            System.out.println("Queue Empty");
        }
    }

    public int front(){
        if (!isEmpty()){
            return data[front];
        } else {
            System.out.println("Stack Empty");
            return 0;
        }


    }

    public void display(){
        for (int i = front; i != back; i = (i+1)%data.length){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueuePractice myQ = new QueuePractice();
        myQ.enqueue(300);
        myQ.enqueue(239);
        myQ.enqueue(741);
        myQ.enqueue(920);
        myQ.dequeue();
        myQ.display();
        myQ.front();
    }
}
