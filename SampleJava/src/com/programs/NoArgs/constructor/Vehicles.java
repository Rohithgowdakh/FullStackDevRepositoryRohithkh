package com.programs.NoArgs.constructor;

class TwoWheeler {
    String brand;
    String model;
    int engineCapacity;
    double price;

    TwoWheeler() {
        brand = "Honda";
        model = "CBR 150R";
        engineCapacity = 150;
        price = 125000.00;
        System.out.println("Two Wheeler Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine Capacity (cc): " + engineCapacity);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class FourWheeler {
    String brand;
    String model;
    String fuelType;
    double price;

    FourWheeler() {
        brand = "Toyota";
        model = "Fortuner";
        fuelType = "Diesel";
        price = 3500000.00;
        System.out.println("Four Wheeler Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class HeavyVehicle {
    String brand;
    String model;
    int loadCapacity;
    double price;

    HeavyVehicle() {
        brand = "Tata";
        model = "LPT 3118";
        loadCapacity = 31000;
        price = 2800000.00;
        System.out.println("Heavy Vehicle Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Load Capacity (kg): " + loadCapacity);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Vehicles{
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        FourWheeler fourWheeler = new FourWheeler();
        HeavyVehicle heavyVehicle = new HeavyVehicle();
    }
}
