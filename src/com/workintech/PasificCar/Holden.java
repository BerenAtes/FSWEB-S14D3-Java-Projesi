package com.workintech.PasificCar;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        getClassSimpleName();
        return "Holden's engine is starting";
    }

    @Override
    public String accelerate() {
        getClassSimpleName();
        return "Holden is accelerating";
    }

    @Override
    public String brake() {
        getClassSimpleName();
        return "Holden is braking";
    }
}
