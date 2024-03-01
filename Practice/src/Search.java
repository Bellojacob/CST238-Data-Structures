import java.util.Random;

public class Search {
    // in our search class we will have 4 methods, a display method, a sort method, a linear search method, and a binary search method
    int[] data;
    int arraySize;
    int DEFAULT_TARGET = 5;

    public Search(){
        arraySize = 10;
        data = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++){
            data[i] = random.nextInt(arraySize) + 1;
        }
    }

    public void display(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");

        }
        System.out.println();
    }

    public void sort(int[] a){
        for (int i = 0; i < data.length; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    public int linearSearch(int[] a, int target){
        for (int i = 0; i < a.length; i++){
            if (a[i] == target){
                System.out.print("We found you number at index ");
                return i;
            }
        }
        System.out.print("We did not find your number: ERROR CODE ");
        return -1;
    }

    public int binarySearch(int[] a, int target){
        int first = 0;
        int last = a.length;
        boolean found = false;
        int position = -1;

        while (!found && first <= last){
            int middle = (first + last)/2;
            if (a[middle] == target){
                found = true;
                position = middle;
            } else if (a[middle] > target) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        Search s1 = new Search();
        s1.display(s1.data);
        s1.sort(s1.data);
        s1.display(s1.data);
        System.out.println(s1.linearSearch(s1.data, s1.DEFAULT_TARGET));
        System.out.println(s1.binarySearch(s1.data, s1.DEFAULT_TARGET));
    }
}


