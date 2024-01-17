package com.workintech.CarRD;

public class MainSkeleton {
    public static void main(String[] args) {
        CarSkeleton carSkeleton=new CarSkeleton("skeleton name","skeleton description");


    CarSkeleton electricCar=new ElectricCar("electric car","car runs on electricity",150,1000);
    CarSkeleton gasPoweredCar=new GasPoweredCar("gas powered car","car runs on gas",200,2000);
    CarSkeleton hybridCar=new HybridCar("hybrid car","runs on both gas and electricity",250,3000,4);

    System.out.println("************************");
    electricCar.drive();
    gasPoweredCar.drive();
    hybridCar.drive();
}
}
