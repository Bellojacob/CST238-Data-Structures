/* Title: Queue.java
 * Abstract: This program takes the extendedQueue solution from the lab, and we are adding 4 method. isSorted, drop,
 * indexUsed, dump. We are also changing the queue capacity to 7. Changing the queue datatype to char, and testing
 * each method.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 5 hours
 * Date: 02/18/2024
 */
public class Queue {

    public static final int QUEUE_CAPACITY = 7;
    private char[] data;
    private int front;
    private int back;

    public Queue() {
        data = new char[QUEUE_CAPACITY];
        front = 0;
        back = 0;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(char value) {
        int newBack = (back + 1) % data.length;
        if (newBack == front) {
            System.out.println("**Queue full - cannot enqueue " + value + "**");
            return;
        }
        data[back] = value;
        back = newBack;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("**Queue empty - cannot dequeue**");
            return;
        }
        // data[front] = null; // only if stack contains objects
        front = (front + 1) % data.length;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("**Queue empty - returning garbage value**");
            return 0;
        }
        return data[front];
    }

    public int find(char value) {
        boolean found = false;
        int pos = 1;
        for (int i = front; i != back; i = (i + 1) % data.length) {
            if (data[i] == value) {
                found = true;
                break;
            } else {
                pos++;
            }
        }

        if (!found) {
            return -1;
        } else {
            return pos;
        }

    }

    public int freeSpace() {
        if (isEmpty()) {
            return data.length - 1;
        } else if (front < back) {
            return data.length - (back - front) - 1;
        } else {
            return front - back - 1;
        }
    }

    public void rearrange() {
        char[] d2 = new char[data.length];
        int i = 0, k = front;
        for (; k != back; i++, k++) {
            d2[i] = data[k];
        }
        data = d2;
        front = 0;
        back = i;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Queue Contents: ");
        if (isEmpty()) {
            sb.append("Empty");
        } else {
            for (int i = front; i != back; i = (i + 1) % data.length) {
                sb.append(data[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // boolean isSorted()
    // boolean drop(char value)
    // boolean indexUsed(int index)
    // dump()

    // if queue order is ABC then it is sort, can also be (ABBC or CBAA)
    // also if it is CBA it is sorted backwards
    // if queue contains 0 or 1 elements it is sorted
    // otherwise, queue is not sorted
    // NOTE:
    // I am not ignoring case sensitivity because A and a are different ascii values
    // technically a(97) > A(65)

    public boolean isSorted() {
        if (isEmpty() || (back - front == 1)) {
            return true;
        }
        // init boolean values
        boolean ascendingOrder = true;
        boolean descendingOrder = true;


        for (int i = front; i != back; i = (i + 1) % data.length) {
            int nextIndex = (i + 1) % data.length;
            if (nextIndex != back) {
                if (data[i] > data[nextIndex]) {
                    ascendingOrder = false;
                }
                if (data[i] < data[nextIndex]) {
                    descendingOrder = false;
                }
            }
        }

        return ascendingOrder || descendingOrder;

    }

    // removes a char
    // if it successfully drops the char, return true
    // if unsuccessful then return false
    // if the char repeats, only drop the first
    public boolean drop(char value) {
        if (!isEmpty()) {
            int index = this.find(value) - 1;

            if (index != -1) {
                if (index < 0 || index >= data.length) {
                    System.out.println("Invalid Index");
                }

                for (int i = index; i != back - 1; i = (i + 1) % data.length) {
                    data[i] = data[(i + 1) % data.length];
                }
                back = (back - 1 + data.length) % data.length;
                return true;
            }
        }
        return false;
    }

    // return true if index is valid and false if invalid
    public boolean indexUsed(int index) {
        if (front <= back) {
            // If front is less than or equal to back, indexes in use are from front to back - 1
            return index >= front && index < back;
        } else {
            // If front is greater than back, indexes in use are from front to QUEUE_CAPACITY - 1 and from 0 to back - 1
            return index >= front || index < back;
        }
    }


    public void dump() {
        // print out front and back
        System.out.println("front: " + front);
        System.out.println("back: " + back);
        // print out data
        for (int i = 0; i < data.length; i++) {
            if (i >= front && i < back) {
                System.out.print(data[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

//    public static void main(String[] args) {
//        Queue q = new Queue();
//        q.enqueue('a');
//        q.enqueue('b');
//        q.enqueue('c');
//        q.enqueue('d');
//        q.enqueue('e');
//        q.enqueue('f');
//
//
//    }
}


