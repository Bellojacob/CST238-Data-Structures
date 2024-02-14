public class Stack {
    // a stack has 3 attributes, a capacity, a top int variable, and an array
    // all must be declared private in the class attributes
    // we make out constructor have two things:
    // top = -1
    // and init our array with capacity as the size of the array

    private int top;
    public final int CAPACITY = 128;
    private int[] data;

    //constructor
    public Stack(){
        top = -1;
        data = new int[CAPACITY];
    }

    // now we can give methods for our Stack
    // common methods:
    // isEmpty
    // pushing (Adding elements to the top)
    // popping (removing top element)
    // top (get top element)

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int value){
        if (top <= data.length - 1){
            ++top;
            data[top] = value;
        } else {
            System.out.println("Stack is Full");
        }
    }

   public void pop(){
        if (!isEmpty()){
            top--;
        } else {
            System.out.println("List Empty Foo");
        }
   }

    public void top(){
        if (!isEmpty()){
            System.out.println(data[top]);
        } else {
            System.out.println("Stack Empty, No value to grab");
        }
    }

    public void display(){
        for (int i = top; i >= 0; i--){
            System.out.print(data[i] + " ");
        }
    }



    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(25);
        myStack.push(50);
        myStack.push(75);

        myStack.top();

        myStack.display();
    }
}
