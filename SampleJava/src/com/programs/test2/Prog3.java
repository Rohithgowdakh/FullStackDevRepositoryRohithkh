package com.programs.test2;
class School1{
	String schoolName;
	
	String address;
	static String studName;
	static int StudAge;
	
}
class GetDet
{
	GetDet()
	{
		School1 o1=new School1();
		o1.schoolName="GECK";
		o1.address="KR PET";
		School1.studName="rohith";
		School1.StudAge=21;
		System.out.println(o1.schoolName);
		System.out.println(o1.address);
		System.out.println(School1.studName);
		System.out.println(School1.StudAge);
	}
}
public class Prog3 {

	public static void main(String[] args) {
		GetDet o1=new GetDet();
	}

}
