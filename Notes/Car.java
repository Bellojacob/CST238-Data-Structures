package Notes;

public class Car {
    private int weight;

    Car(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public static void main(String[] args) {
        //System.out.println("Hello");
        Car car1 = new Car(2500);
//        car1.setWeight(10);
        System.out.println(car1.getWeight());
    }
}
