package hw3;

public class NumberList {
    private int[] myArray = {10,20,30,40,50,15,25,35,45,55};
    private int size = myArray.length;


    public boolean isEmpty(){
        return size == 0;
    }
    public void print(){
        for (int i =0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }

    // delete max value by shifting left
    public void deleteMax(){
        // find the maximum value
        int maxValueIndex = 0;
        for (int i = 0; i < size; i++){
            if (myArray[i] > myArray[maxValueIndex]){
                maxValueIndex = i;
            }
        }
        for (int i = maxValueIndex; i < size - 1; i++){
            myArray[i] = myArray[ i + 1];
        }
    size--;
    }

    public static void main(String[] args) {
        NumberList nl = new NumberList();
        nl.print();
        System.out.println("\n");
        nl.deleteMax();
        nl.print();
    }
}
