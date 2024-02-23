/* Title: Stack.java
 * Abstract: This program is added is a Stack Binary converter, we are starting with starting code from class and going
 * to add a static method that takes in a number in base 10 (decimal or 26) and converts it to base 2 (binary or 10101).
 * Our method will be called convert.
 * Note: If number is greater than 3, ex: 4 or more (1234), stack full will be presented.
 * I was not instructed to change anything in the instructions outside of making a new static method.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 1 hours
 * Date: 02/18/2024
 */
import java.util.Scanner;

public class Stack {
    public static final int STACK_CAPACITY = 10;
    private int [] data;
    private int top;

    public Stack() {
        data = new int[STACK_CAPACITY];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if(top + 1 == data.length) {
            System.out.println("**Stack full - cannot push " + value + "**");
            return;
        }
        data[++top] = value;
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("**Stack empty - cannot pop**");
            return;
        }
        // data[top] = null; // only if stack contains objects
        top--;
    }

    public int top() {
        if(isEmpty()) {
            System.out.println("**Stack empty - returning garbage value**");
            return 0;
        }
        return data[top];
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Stack Contents: ");
        if(isEmpty()) {
            sb.append("Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                sb.append(data[i] + " ");
            }
        }
        return sb.toString();
    }

    // my binary converter method that takes an int number
    public static String convert(int number){
        // create a new stack object
        Stack stack = new Stack();
        while (number != 0) {
            // add the remainder to the stack
            if (number % 2 == 1) {
                stack.push(1);
            } else if (number % 2 == 0) {
                stack.push(0);
            }
            // divide the number by 2 and loop
            number = number/2;
        }



        // When done converting, use the stack and a StringBuffer to convert the stack contents to a string
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()){
            sb.append(stack.top());
            stack.pop();
        }
        return sb.toString();
    }

    //    public static void main(String[] args) {
    //        Scanner in = new Scanner(System.in);
    //        int number = 1;
    //        Stack bin = new Stack();
    //        while(number != 0) {
    //            System.out.print("Enter a positive number (0 to quit): ");
    //            number = in.nextInt();
    //            if(number < 1) {
    //                break;
    //            }
    //            System.out.print(number + " => ");
    //            System.out.println(convert(number));
    //        }
    //        System.out.println("Exiting");
    //    }
}