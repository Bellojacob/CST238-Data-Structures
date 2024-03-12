package Practice.Lab;

public class SortedList {

        private int[] data;
        private int size;

        public SortedList() {
            data = new int[10];
            data[0] = 5;
            data[1] = 10;
            data[2] = 15;
            data[3] = 20;
            data[4] = 25;
            size = 5;
        }

        public void insertSorted(int value) {
            if (size < data.length) {

                int i = 0;
                while (i < size && data[i] < value) {
                    i++;
                }
                for (int j = size; j > i; j--) {
                    data[j] = data[j - 1];
                }
                data[i] = value;
                size++;
            } else {
                System.out.println("Array Full");
            }
        }


        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append(data[i]);

                if (i < size - 1) {
                    sb.append(" ");
                }
            }
            return sb.toString();
        }


    public static void main(String[] args) {
        SortedList s1 = new SortedList();
        s1.insertSorted(18);
        s1.insertSorted(16);
        s1.insertSorted(19);
        s1.insertSorted(21);

        System.out.println(s1.toString());
    }
    }

