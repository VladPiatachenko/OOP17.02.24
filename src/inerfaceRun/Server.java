package inerfaceRun;

import transport.Vehicle;

public class Server {
    // кількість транспортних засобів (ТЗ) кожного виду, що виїхали в місто
    private int[] countVehicles;
    // загальна кількість ТЗ, що виїхали в місто
    private int commonCountVehicles;
    // обмеження на кількість ТЗ, що одночасно виїхали в місто
    private int limitVehicle;
    // масив, що зберігає ТЗ будь-якого виду
    private Run[] vehicles;

    // конструктор класу, параметр size – кількість видів ТЗ
    public Server(int size) {
        countVehicles = new int[size];
        limitVehicle=size;
        vehicles = new Run[limitVehicle];
    }

    // повертає обмеження на кількість ТЗ, що одночасно виїхали в місто
    public int getLimitVehicle () {
        return limitVehicle;
    }

    // повертає загальну кількість ТЗ, що виїхали в місто
    public int getCurrentCountVehicle () {
        return commonCountVehicles;
    }

// додає ТЗ до віртуальної бази
    public void addTransport (int numberVehicles, Run vehicle) {
        countVehicles[numberVehicles]++;
        commonCountVehicles ++;
        vehicles [numberVehicles] = vehicle;
        vehicle.move(countVehicles[numberVehicles]);
    }
}

