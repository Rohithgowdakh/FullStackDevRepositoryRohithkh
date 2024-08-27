package com.programs.constructorOverloading;
class Invoice
{
	
	Invoice(String customerName)
	{
		System.out.println("customer Name:"+customerName);
	}
	Invoice(double tax)
	{
		this("roohith");
		System.out.println("tax :"+tax);
		
	}
	Invoice(String itemName,int quantity)
	{
		
		this(10000.00);
		System.out.println("Item Name :"+itemName);
		System.out.println("quantity :"+quantity);
	}
}

public class InvoiceDetails {

	public static void main(String[] args) {
		Invoice cus1=new Invoice("Rohitt");
		Invoice cus2=new Invoice("gadget",10);
		Invoice cus3=new Invoice(1200.00);
	}

}
