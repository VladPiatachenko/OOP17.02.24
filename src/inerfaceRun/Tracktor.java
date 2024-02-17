package inerfaceRun;

public abstract class Tracktor extends Machine{
    String type;

    Tracktor(String name, double weigth, double maxSpeed, int passangers) {
        super(name, weigth, maxSpeed, passangers);
    }

    Tracktor (String name, int speed, int weight, String type) {
        super(name,weight,speed,0);
        this.type=type;
    }

    public String getType() {
        return type;
    }
}
