package Labs.Week2;

public class Stack {
    public static final int STACK_CAPACITY = 128;
    private int top;
    private int[] data;

    public Stack(){
        top = -1;
        data = new int[STACK_CAPACITY];

    }

    public void push(int value){
        if (top < data.length - 1){
            data[++top] = value;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop(){
        top--;
    }

    public void display(){
        for (int i = top; i >= 0; i--){
            System.out.println(data[i]);
        }
    }
}
