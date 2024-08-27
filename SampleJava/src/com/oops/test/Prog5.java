package com.oops.test;
class Outer{
	static int a=20;
	static int b=5;
	static void getSum(int a,int b){
		
		int res=a+b;
		int res2=a+b+inner.z;
		System.out.println("addition2 res :"+res2);
		System.out.println("addition res :"+res);
		
	}
		class inner
		{
			static int z=10;
			static void getSub() {
				int res=a-b;
				System.out.println("subtraction res :"+res);
			}
		}
}
public class Prog5 {

	public static void main(String[] args) {
		Outer.getSum(10, 100);
		Outer.inner.getSub();
	}

}
