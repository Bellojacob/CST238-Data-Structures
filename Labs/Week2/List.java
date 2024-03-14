//package Labs.Week2;
//
//public class List {
//    public class List {
//        private static int DEFAULT_CAPACITY = 10;
//        private int size;
//        private Money [] data;
//
//        public List() {
//            size = 0;
//            data = new Money[DEFAULT_CAPACITY];
//        }
//
//        public List(int capacity) {
//            size = 0;
//            data = new Money[capacity];
//        }
//
//        public boolean isEmpty() {
//            return size == 0;
//        }
//
//        public void insert(Money item, int position) {
//            if(size == data.length) {
//                System.out.println("** No space for list element **");
//                return;
//            }
//
//            if(position < 0 || position > size) {
//                System.out.println("** Illegal location to insert " + position + " **");
//                return;
//            }
//
//            size++;
//            for (int i = size - 1; i > position; i--){
//                data[i] = data[i - 1];
//            }
//            data[position] = item;
//        }
//
//
//        public void remove(int position) {
//            if(isEmpty()){
//                System.out.println("Error: Cannot remove from an empty list");
//                return;
//            }
//            if(position < 0 || position > size) {
//                System.out.println("** Illegal location to insert " + position + " **");
//                return;
//            }
//
//            size--;
//            for(int i = position; i < size; i++){
//                data[i] = data[ i + 1];
//            }
//
//
//        }
//
//        public void display() {
//            if(isEmpty()) {
//                System.out.println("Empty list");
//                return;
//            } else {
//                System.out.print("List of size " + size + ": ");
//            }
//
//            for(int i = 0; i < size; i++) {
//                System.out.print(data[i] + " ");
//            }
//            System.out.println();
//        }
//
//
//        public int find(Money value) {
//            for(int i = 0; i < size; i++){
//                if(data[i].equals(value)) {
//                    return i;
//                }
//            }
//            return -1;
//        }
//
//        public Money sum() {
//            int sum = 0;
//            for(int i = 0; i < size; i++){
//                sum += data[i].getDollars()*100;
//                sum += data[i].getCents();
//            }
//            Money moneySum = new Money();
//            moneySum.setDollars(sum/100);
//            moneySum.setCents(sum%100);
//            return moneySum;
//        }
//
//
//        public boolean append(int value) {
//            return false;
//        }
//
//    }
//}
