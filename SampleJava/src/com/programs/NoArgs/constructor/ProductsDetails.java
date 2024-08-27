package com.programs.NoArgs.constructor;
class Product {
    String productName;
    int productId;
    double price;
    int stock;

    Product() {
        productName = "Laptop";
        productId = 101;
        price = 999.99;
        stock = 50;
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println();
    }
}


class Sales {
    String salesPerson;
    double salesAmount;
    int salesId;
    String salesRegion;

    Sales() {
        salesPerson = "Alice";
        salesAmount = 1500.75;
        salesId = 301;
        salesRegion = "North";
        System.out.println("Sales Person: " + salesPerson);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Sales ID: " + salesId);
        System.out.println("Sales Region: " + salesRegion);
        System.out.println();
    }
}


class Order {
    int orderId;
    String orderDate;
    double orderAmount;
    String customerName;

    Order() {
        orderId = 401;
        orderDate = "2023-07-15";
        orderAmount = 2500.00;
        customerName = "John Doe";
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Amount: " + orderAmount);
        System.out.println("Customer Name: " + customerName);
        System.out.println();
    }
}


class Inventory {
    String inventoryName;
    int stockQuantity;
    String location;
    String category;

    Inventory() {
        inventoryName = "Warehouse A";
        stockQuantity = 100;
        location = "Building 1";
        category = "Electronics";
        System.out.println("Inventory Name: " + inventoryName);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Location: " + location);
        System.out.println("Category: " + category);
        System.out.println();
    }
}


public class ProductsDetails {
    public static void main(String[] args) {
        Product product = new Product();
        Sales sales = new Sales();
        Order order = new Order();
        Inventory inventory = new Inventory();

    }
}
