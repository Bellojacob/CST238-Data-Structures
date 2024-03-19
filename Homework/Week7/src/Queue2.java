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
public class Queue2 {
    public static final int QUEUE_CAPACITY = 6;
    private int[] data;
    private int front;
    private int back;

    public Queue2() {
        data = new int[QUEUE_CAPACITY];
        front = 0;
        back = 0;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(int value) {
        int newBack = (back + 1) % data.length;
        if(newBack == front) {
            resize();
            newBack = (back + 1) % data.length;
        }
        data[back] = value;
        back = newBack;
    }

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
        int size = back - front;
        if (size < 0) {
            size += data.length;
        }
        return size;
    }

    public void resize() {
        int newSize = data.length * 2;
        int[] temp = new int[newSize];
        int size = getSize();
        for (int i = 0; i < size; i++) {
            temp[i] = data[(front + i) % data.length];
        }
        front = 0; // Set front to 0 after resizing
        back = size; // Set back to the size of the queue before resizing
        data = temp;
    }

    public String printable() {
        StringBuilder sb = new StringBuilder();
        sb.append("(f: ").append(front).append(", b: ").append(back).append(") Contents: ");
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}