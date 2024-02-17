package inerfaceRun;

import empl.Manager;

import java.io.Serializable;

public abstract class Machine implements Run {

    String name;
    double weigth;
    double maxSpeed;
    int passangers;

    Machine(String name, double weigth, double maxSpeed, int passangers){
        this.name=name;
        this.weigth=weigth;
        this.maxSpeed=maxSpeed;
        this.passangers=passangers;
    }

    public void printName(){
        System.out.println("This is "+name);
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public double getWeight(){
        return weigth;
    }
    public void move (int i){
        System.out.println(this.name+" "+ i+"is on road!");
    }
}
