/* Title: ExtendedQueue.java
 * Abstract: This program takes the extendedQueue solution from the lab, and we are adding 4 method. isSorted, drop,
 * indexUsed, dump. We are also changing the queue capacity to 7. Changing the queue datatype to char, and testing
 * each method.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 4 hours
 * Date: 02/18/2024
 */
public class ExtendedQueue {

        public static final int QUEUE_CAPACITY = 7;
        private char[] data;
        private int front;
        private int back;

        public ExtendedQueue() {
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
            for(int i = front; i != back; i = (i + 1) % data.length) {
                if(data[i] == value) {
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
            if(isEmpty()) {
                return data.length - 1;
            } else if(front < back) {
                return data.length - (back - front) - 1;
            } else {
                return front - back - 1;
            }
        }

        public void rearrange() {
            char [] d2 = new char[data.length];
            int i = 0, k = front;
            for(; k != back; i++, k++ ) {
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

        // if queue order is ABC then it is sort, can also be (ABBC or CBAA)
        // also if it is CBA it is sorted backwards
        // if queue contains 0 or 1 elements it is sorted
        // otherwise, queue is not sorted
//        public boolean isSorted(){
//            if ()
//            return false;
//        }

        public boolean drop(char value){

            return false;
        }

        public boolean indexUsed(int index){

            return false;
        }

        public void dump(){

        }
    }


