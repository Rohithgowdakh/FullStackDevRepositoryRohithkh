package com.programs.constructor.parameterized;

class Product {
    String productName;
    int productId;
    double price;
    int stock;

    Product(String pName, int pId, double pPrice, int pStock) {
        productName = pName;
        productId = pId;
        price = pPrice;
        stock = pStock;
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

    Sales(String sPerson, double sAmount, int sId, String sRegion) {
        salesPerson = sPerson;
        salesAmount = sAmount;
        salesId = sId;
        salesRegion = sRegion;
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

    Order(int oId, String oDate, double oAmount, String oCustomer) {
        orderId = oId;
        orderDate = oDate;
        orderAmount = oAmount;
        customerName = oCustomer;
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

    Inventory(String iName, int iQuantity, String iLocation, String iCategory) {
        inventoryName = iName;
        stockQuantity = iQuantity;
        location = iLocation;
        category = iCategory;
        System.out.println("Inventory Name: " + inventoryName);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Location: " + location);
        System.out.println("Category: " + category);
        System.out.println();
    }
}

public class Products {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 101, 999.99, 50);
        Sales sales1 = new Sales("Alice", 1500.75, 301, "North");
        Order order1 = new Order(401, "2023-07-15", 2500.00, "John Doe");
        Inventory inventory1 = new Inventory("Warehouse A", 100, "Building 1", "Electronics");
    }
}
