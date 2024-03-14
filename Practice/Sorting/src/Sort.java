package Practice.Sorting.src;

import java.util.Random;
// sort and search file
public class Sort {

    public static void main(String[] args) {
        int maxNum = 10;

        int[] data = new int[maxNum];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(maxNum) + 1;
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // now sort
//        for (int i = 0; i < data.length; i++) {
//            int minimumIndex = i;
//            for (int j = i + 1; j < data.length; j++){
//                if (data[j] < data[minimumIndex]){
//                    minimumIndex = j;
//                }
//            }
//            int temp = data[minimumIndex];
//            data[minimumIndex] = data[i];
//            data[i] = temp;
//        }

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

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
        // now lets implement a linear search
        int target = 5;
        int counter =0;
        for (int i = 0; i < data.length; i++){
            counter++;

            if (data[i] == target){
                System.out.println("We found " + target + " at " +  " in " + counter + " moves!");
                break;
            }

        }

        // now let's implement a binary search

        int first = 0;
        int last = data.length;
        boolean found = false;
        int position = -1;
        while(!found && first <= last){
            counter++;
            int middle = (first + last)/2;
            if (data[middle] == target){
                found = true;
                position = middle;
            } else if (data[middle] > target){
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        System.out.println("In our binary search we found " + target + " at position index " + position );
    }
}
