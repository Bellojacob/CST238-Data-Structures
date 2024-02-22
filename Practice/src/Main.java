public class Main {
    static int [] data = new int[4];

    public static void main(String[] args) {
        Main.data[0] = 1;
        Main.data[1] = 2;
        Main.data[2] = 3;
        Main.data[3] = 4;

        for (int i = 0; i < data.length; i++){
            System.out.println(Main.data[i]);
        }
        System.out.println(Main.data[5]);
    }
}