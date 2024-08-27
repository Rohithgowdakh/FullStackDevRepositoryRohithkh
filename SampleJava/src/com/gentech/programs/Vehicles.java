package com.gentech.programs;

	class TwoWheeler
	{
		String veclName;
		int veclNo;
	}
	class FourWheeler
	{
		String veclName;
		int veclNo;
	}
	class HeavyVehicle
	{
		String veclName;
		int veclNo;
	}
	public class Vehicles {
	
	public static void main(String[] args)
	{
		TwoWheeler bike=new TwoWheeler();
		bike.veclName="ZX10RR";
		bike.veclNo=4016;
		System.out.println("bike name :"+bike.veclName);
		System.out.println("bike number :"+bike.veclNo);
		System.out.println("++++++++++++++");
		TwoWheeler bike2=new TwoWheeler();
		bike.veclName="JUPITER";
		bike.veclNo=4026;
		System.out.println("bike name :"+bike2.veclName);
		System.out.println("bike number :"+bike2.veclNo);
		System.out.println();
		FourWheeler car=new FourWheeler();
		car.veclName="benz";
		car.veclNo=4016;
		System.out.println("car name :"+car.veclName);
		System.out.println("car number :"+car.veclNo);
		System.out.println("++++++++++++++");
		FourWheeler car2=new FourWheeler();
		car2.veclName="JUPITER";
		car2.veclNo=4026;
		System.out.println("car name :"+car2.veclName);
		System.out.println("car number :"+car2.veclNo);
		System.out.println();
		HeavyVehicle Truck=new HeavyVehicle();
		Truck.veclName="Ashok Layland";
		Truck.veclNo=3039;
		System.out.println("Truck name :"+Truck.veclName);
		System.out.println("Truck number :"+Truck.veclNo);
		System.out.println("++++++++++++++");
		HeavyVehicle Truck2=new HeavyVehicle();
		Truck2.veclName="Bharat benz";
		Truck2.veclNo=3139;
		System.out.println("Truck name :"+Truck2.veclName);
		System.out.println("Truck number :"+Truck2.veclNo);
	}

}