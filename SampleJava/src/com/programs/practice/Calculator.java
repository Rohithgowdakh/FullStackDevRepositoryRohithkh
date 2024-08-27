package com.programs.practice;
class Calc
{
	static void getAdd(int a,int b){
		int res=a+b;
		System.out.println("add is :"+res);
	}
	static void getSub(int a,int b){
		int res=a-b;
		System.out.println("sub is :"+res);
	}
	static void getMul(int a,int b){
		int res=a*b;
		System.out.println("mul is :"+res);
	}
	static void getDiv(int a,int b){
		int res=a/b;
		System.out.println("div is :"+res);
	}
}
public class Calculator {

	public static void main(String[] args) {
		Calc.getAdd(10, 10);
		Calc.getMul(10, 10);

	}

}
