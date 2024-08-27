package com.programs.abstractclass;
abstract class College1
{
	String CollName;
	int collId;
	String address;
	
	{
		CollName="GECK";
		System.out.println("College Name :"+CollName);
		collId=1001;
		System.out.println("College Id :"+collId);
		address="KR PET";
		System.out.println("address :"+address);
	}
}
class College2 extends College1
{
	
}
public class AbstractInstance {

	public static void main(String[] args) {
		College2 ob1=new College2();
	}

}
