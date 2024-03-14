/* Title: Queue.java
 * Abstract: This program is an extension of the original Queue class. First change the QUEUE_CAPACITY to 6. Add a new
 * method to getCapacity() that returns the capacity. Add a method to return the size called getSize(). Now create a
 * resize method to make the original array larger. We will copy items from old array to new array and make the new array's
 * size double the length of the old array. Next we will change the dequeue method to make the front index == 0. Then we
 * will change the enqueue method to call the resize method whenever the array is at max capacity. Lastly, add a toString
 * method to return a string as specified in the instructions. The toString method will be called printable.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 3 hour
 * Date: 03/11/2024
 */
public class Queue {
    public static final int QUEUE_CAPACITY = 6;
    private int[] data;
    private int front;
    private int back;

    public Queue() {
        data = new int[QUEUE_CAPACITY];
        front = 0;
        back = 0;
    }

    public boolean isEmpty() {
        return front == back;
    }

    // new enqueue method
    public void enqueue(int value) {
            int newBack = (back + 1) % data.length;
            if(newBack == front) {
                resize();
            }
            data[back] = value;
            newBack = (back + 1) % data.length;
            back = newBack;
        }




    // new dequeue
    public void dequeue() {
        if (!isEmpty()) {
            data[front] = 0;
            front = (front + 1) % data.length;
        }
    }

    public int getCapacity() {
        return data.length - 1;
    }

    public int getSize() {
        return (back - front + data.length) % data.length;
    }

    // resize will be called by enqueue if needed
    public void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < getSize(); i++) {
            temp[i] = data[(front + i) % data.length];
        }

        front = 0;
        back = getSize();
        data = temp;

    }

    // toString method
    public String printable() {
        StringBuilder sb = new StringBuilder();
        sb.append("(f: ").append(front).append(", b: ").append(back).append(") Contents: ");
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}