package com.programs.abstractclass;
abstract class College
{
	static String CollName;
	static int collId;
	static String address;
	static
	{
		CollName="GECK";
		System.out.println("College Name :"+CollName);
		collId=1001;
		System.out.println("College Id :"+collId);
		address="KR PET";
		System.out.println("address :"+address);
	}
	
}
class SubClass extends College
{
	
}
public class AbstractStaticAlone {

	public static void main(String[] args) {
		College obj1=new SubClass();
	}

}
