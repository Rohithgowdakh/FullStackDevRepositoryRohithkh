package com.programs.retest;
class Area
{
	static double getArea()
	{
		float pi=3.14f;
		int r=3;
		double res=pi*r*r;
		return res;
	}
}
public class AreaCir {

	public static void main(String[] args) {
		double res=Area.getArea();
		System.out.println(res);
	}

}
