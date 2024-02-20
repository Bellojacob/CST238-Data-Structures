public class StackPractice {
    // a stack has 3 attributes, a capacity, a top int variable, and an array
    // all must be declared private in the class attributes
    // we make out constructor have two things:
    // top = -1
    // and init our array with capacity as the size of the array

    private int top;
    public final int CAPACITY = 128;
    private int[] data;

    //constructor
    public StackPractice(){
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

    // add / push method
    public void push(int value){
        // check if Stack isn't full
        if (top < data.length - 1){
            // move top forward one position
            ++top;
            data[top] = value;
        } else {
            System.out.println("Stack is Full");
        }
    }

    // pop / remove method
    public void pop(){
        // check if stack has an element to remove
        if (!isEmpty()){
            top--;
        } else {
            System.out.println("Stack is Empty");
        }
    }

    // top method to get item at top of stack or last item in
    public void top(){
        // make sure we have an item in the stack
        if (!isEmpty()){
            System.out.println(data[top]);
        } else {
            System.out.println("List is Empty");
        }
    }

    public void display(){
        for (int i = top; i >= 0; i--){
            System.out.print(data[i] + " ");
        }
    }


    public static void main(String[] args) {
        StackPractice myStackPractice = new StackPractice();
        myStackPractice.push(25);
        myStackPractice.push(50);
        myStackPractice.push(75);

        myStackPractice.pop();

        myStackPractice.top();

        myStackPractice.display();
    }
}
