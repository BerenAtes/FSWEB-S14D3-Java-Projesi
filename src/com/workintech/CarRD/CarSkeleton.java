package com.workintech.CarRD;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println("startEngine");
    }

    public void drive(){
        runEngine(this);
        System.out.println(name + "driving");
    }

    protected void runEngine(CarSkeleton carSkeleton){
        System.out.println(getClass().getSimpleName());

        if (carSkeleton instanceof ElectricCar){
            System.out.println("Electric car run engine. kmPerCharge:" +
                    ((ElectricCar)carSkeleton).getAvgKmPerCharge());
        } else if (carSkeleton instanceof GasPoweredCar) {
            System.out.println("GasPowered car run engine. kmPerCharge:" +
                    ((GasPoweredCar)carSkeleton).getAvmKmPerlitre());
        } else if (carSkeleton instanceof HybridCar){
            System.out.println("Hybrid car run engine. kmPerCharge:" +
                    ((HybridCar)carSkeleton).getAvgKmPerLitre());
        } else {
            System.out.println("None of");
        }


    }
}
