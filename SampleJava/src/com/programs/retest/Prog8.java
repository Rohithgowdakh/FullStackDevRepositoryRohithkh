package com.programs.retest;
class Byte
{
	byte[] getByte(byte a[])
	{
		byte ab[]=new byte[a.length];
		for(int i=0;i<a.length;i++)
		{
			ab[i]=a[i];
		}
		return ab;
	}
}
public class Prog8 {

	public static void main(String[] args) {
		byte a[]= {10,20,30,40};
		Byte o1=new Byte();
		byte res[]=o1.getByte(a);
		for(int ele:res) {
			System.out.println(ele);
		}
	}

}
