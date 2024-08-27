package com.polymorphism;

class Appliance {
    void displayPowerConsumption(int power) {
        System.out.println("Power consumption for a particular appliance:");
    }
}

class WashingMachine extends Appliance {
    void displayPowerConsumption(int power) {
        System.out.println("Power consumption of Washing Machine: " + power + " watts");
    }
}

class Refrigerator extends Appliance {
    void displayPowerConsumption(int power) {
        System.out.println("Power consumption of Refrigerator: " + power + " watts");
    }
}

class Microwave extends Appliance {
    void displayPowerConsumption(int power) {
        System.out.println("Power consumption of Microwave: " + power + " watts");
    }
}

public class ApplianceTest {

    public static void main(String[] args) {
        Appliance appliance;

        appliance = new WashingMachine();
        appliance.displayPowerConsumption(500);
        
        appliance = new Refrigerator();
        appliance.displayPowerConsumption(200);
        
        appliance = new Microwave();
        appliance.displayPowerConsumption(1000);
    }
}
