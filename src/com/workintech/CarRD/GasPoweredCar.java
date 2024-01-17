package com.workintech.CarRD;

public class GasPoweredCar extends CarSkeleton{

    private double avmKmPerlitre;
    private int cylinders;
    public GasPoweredCar(String name, String description,double avmKmPerlitre,int cylinders) {
        super(name, description);
        this.avmKmPerlitre=avmKmPerlitre;
        this.cylinders=cylinders;
    }

    public double getAvmKmPerlitre() {
        return avmKmPerlitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avmKmPerlitre=" + avmKmPerlitre +
                ", cylinders=" + cylinders +
                '}';
    }
}
