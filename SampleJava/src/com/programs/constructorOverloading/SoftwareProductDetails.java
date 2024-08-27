package com.programs.constructorOverloading;

class SoftwareProduct {
    String productName;
    double price;
    int version;
    String licenseKey;
    boolean isActivated;

   
    SoftwareProduct(String productName) {
        this.productName = productName;
        System.out.println("Product Name: " + productName);
    }

   
    SoftwareProduct(double price) {
        this("Default Product");
        this.price = price;
        System.out.println("Price: $" + price);
    }

    
    SoftwareProduct(String productName, int version) {
        this(199.99);  
        this.productName = productName;
        this.version = version;
        System.out.println("Product Name: " + productName);
        System.out.println("Version: " + version);
    }

    
    SoftwareProduct(String productName, double price, int version, String licenseKey, boolean isActivated) {
        this(productName, version);  
        this.price = price;
        this.licenseKey = licenseKey;
        this.isActivated = isActivated;
        System.out.println("Price: $" + price);
        System.out.println("License Key: " + licenseKey);
        System.out.println("Activated: " + isActivated);
    }

    
    void generateReport() {
        
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Version: " + version);
        System.out.println("License Key: " + licenseKey);
        System.out.println("Activated: " + isActivated);
    }
}

public class SoftwareProductDetails {

    public static void main(String[] args) {
        SoftwareProduct prod1 = new SoftwareProduct("Antivirus");
        SoftwareProduct prod2 = new SoftwareProduct("Office Suite", 2023);
        SoftwareProduct prod3 = new SoftwareProduct(299.99);
        SoftwareProduct prod4 = new SoftwareProduct("Graphics Editor", 399.99, 2024, "XYZ-123-ABC", true);

        prod4.generateReport(); 
    }
}
