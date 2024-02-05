public class Car {
    private String model;
    private int topSpeed;

    Car(int topSpeed){
        this.topSpeed = topSpeed;
    }
    public String getModel(){
        return model;
    }

    public int getTopSpeed(){
        return topSpeed;
    }

    public String setModel(String newModel){
        return this.model = newModel;
    }

    public String toString(){
        return model + "\t" + topSpeed;
    }
}
