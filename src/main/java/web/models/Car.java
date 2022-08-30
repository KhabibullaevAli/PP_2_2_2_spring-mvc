package web.models;

public class Car {
    private String model;
    private int maxSpeed;
    private int maxLoad;

    public Car() {
    }

    public Car(String model, int maxSpeed, int maxLoad) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxLoad = maxLoad;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }
}
