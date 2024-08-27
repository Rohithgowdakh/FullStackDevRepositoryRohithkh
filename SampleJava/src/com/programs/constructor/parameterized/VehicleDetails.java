package com.programs.constructor.parameterized;

class TwoWheeler {
    String brand;
    String model;
    int engineCapacity;
    double price;

    TwoWheeler(String tBrand, String tModel, int tCapacity, double tPrice) {
        brand = tBrand;
        model = tModel;
        engineCapacity = tCapacity;
        price = tPrice;
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

    FourWheeler(String fBrand, String fModel, String fFuel, double fPrice) {
        brand = fBrand;
        model = fModel;
        fuelType = fFuel;
        price = fPrice;
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

    HeavyVehicle(String hBrand, String hModel, int hCapacity, double hPrice) {
        brand = hBrand;
        model = hModel;
        loadCapacity = hCapacity;
        price = hPrice;
        System.out.println("Heavy Vehicle Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Load Capacity (kg): " + loadCapacity);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class VehicleDetails {
    public static void main(String[] args) {
        TwoWheeler twoWheeler1 = new TwoWheeler("Honda", "CBR 150R", 150, 125000.00);
        FourWheeler fourWheeler1 = new FourWheeler("Toyota", "Fortuner", "Diesel", 3500000.00);
        HeavyVehicle heavyVehicle1 = new HeavyVehicle("Tata", "LPT 3118", 31000, 2800000.00);
    }
}

