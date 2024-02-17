package inerfaceRun;

public class Bus extends Machine{
    Bus(String name, double weigth, double maxSpeed, int passangers) {
        super(name, weigth, maxSpeed, passangers);
    }

    int getNumberOfPassangers(){
        return this.passangers;
    }
}
