package com.oops.test;
class  Division{
	
	static void getDiv(int a,int b) throws Exception{
		try {
		if(b==0) {
			throw new Exception("Anythig divide by 0 is Infinity");
		}
		int res=a/b;
		System.out.println("division result :"+res);
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
public class Prog7 {

	public static void main(String[] args) {
		try {
			Division.getDiv(100,10 );
			Division.getDiv(10, 0);
			Division.getDiv(200, 20);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
