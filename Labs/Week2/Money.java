//package Labs.Week2;
//
//public class MoneyLab2 {
//    public class Money {
//        private int dollarAmount;
//        private int centAmount;
//
//
//        public Money(){
//            dollarAmount = 0;
//            centAmount = 0;
//        }
//
//        public int getCents() {
//            return centAmount;
//        }
//
//        public int getDollars() {
//            return dollarAmount;
//        }
//
//        public void setDollars(int dollarAmount) {
//            this.dollarAmount = dollarAmount;
//        }
//
//        public void setCents(int centAmount) {
//            this.centAmount = centAmount;
//        }
//
//        public String toString(){
//            return "$" + getDollars() + "." + getCents();
//        }
//
//        public static void main(String[] args) {
//            Money m1 = new Money();
//            Money m2 = new Money();
//            System.out.println("m1 initial amount: " + m1.getDollars() + " and "
//                    + m1.getCents());
//            System.out.println("m1 toString: " + m1);
//            m1.setDollars(20);
//            m1.setCents(35);
//            m2.setDollars(10);
//            m2.setCents(98);
//            System.out.println("m1 new amount: " + m1.getDollars() + " and "
//                    + m1.getCents());
//            System.out.println("m1 toString: " + m1);
//            m2.setDollars(10);
//            m2.setCents(98);
//            System.out.println("m2 toString: " + m2);
//            m1.setDollars(50);
//            System.out.println("m1 new amount: " + m1.getDollars() + " and "
//                    + m1.getCents());
//            System.out.println("m1 toString: " + m1);
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (o == this) {
//                return true;
//            }
//            if (!(o instanceof Money)) {
//                return false;
//            }
//            Money money = (Money) o;
//            return this.dollarAmount == money.dollarAmount && this.centAmount == money.centAmount;
//        }
//    }
//
//}
