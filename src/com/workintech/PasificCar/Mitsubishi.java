package com.workintech.PasificCar;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        getClassSimpleName();
        return "Mitsubishi's engine is starting";
    }

    @Override
    public String accelerate() {
        getClassSimpleName();
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        getClassSimpleName();
        return "Mitsubishi is braking";
    }
}
