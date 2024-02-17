package transport;

public class Car extends Vehicle{
    @Override
    public void move(int countVehicle) {
        System.out.println("Car "+countVehicle+" is on road.");
    }
}
