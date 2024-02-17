package transport;

public class Bicycle extends Vehicle{
    @Override
    public void move(int countVehicle) {
        System.out.println("Bicycle "+countVehicle+" is on road.");
    }
}
