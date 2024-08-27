package com.gentech.programs;

class Product {
    String productName;
    int productId;
}

class Sales {
    String salesPersonName;
    double salesAmount;
}

class Order {
    int orderId;
    String orderDate;
}

class Inventory {
    String inventoryName;
    int stockQuantity;
}

public class Products {
    public static void main(String[] args) {
        
        Product product1 = new Product();
        product1.productName = "Laptop";
        product1.productId = 101;
        System.out.println("Product Name: " + product1.productName);
        System.out.println("Product ID: " + product1.productId);
        System.out.println("++++++++++++++");
        Sales sales1 = new Sales();
        sales1.salesPersonName = "John Doe";
        sales1.salesAmount = 1500.75;
        System.out.println("Sales Person Name: " + sales1.salesPersonName);
        System.out.println("Sales Amount: " + sales1.salesAmount);
        System.out.println("++++++++++++++");
        Order order1 = new Order();
        order1.orderId = 2023;
        order1.orderDate = "2023-07-15";
        System.out.println("Order ID: " + order1.orderId);
        System.out.println("Order Date: " + order1.orderDate);
        System.out.println("++++++++++++++");
        Inventory inventory1 = new Inventory();
        inventory1.inventoryName = "Warehouse A";
        inventory1.stockQuantity = 100;
        System.out.println("Inventory Name: " + inventory1.inventoryName);
        System.out.println("Stock Quantity: " + inventory1.stockQuantity);
        System.out.println("++++++++++++++");
    }
}
