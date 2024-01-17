package com.workintech.PasificCar;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        getClassSimpleName();
        return "Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        getClassSimpleName();
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
    getClassSimpleName();
    return "the car is braking";
    }
}
