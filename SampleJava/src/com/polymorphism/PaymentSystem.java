package com.polymorphism;
class payment
{
	void PaymentMethod()
	{
		System.out.println("ways to payment ");
	}
}
class CreditCard extends payment
{
	void PaymentMethod()
	{
		System.out.println("Payment done by using CreditCard");
	}
}
class DebitCard extends payment
{
	void PaymentMethod()
	{
		System.out.println("Payment done by using DebitCard");
	}
}
class GooglePay extends payment
{
	void PaymentMethod()
	{
		System.out.println("Payment done by using GoogalPay");
	}
}
public class PaymentSystem {

	public static void main(String[] args) {
		payment o=new CreditCard();
		o.PaymentMethod();
		
		o=new DebitCard();
		o.PaymentMethod();
		
		o=new GooglePay();
		o.PaymentMethod();
	}

}
