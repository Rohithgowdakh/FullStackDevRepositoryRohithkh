package com.programs.retest;
class Array1
{
	
	static boolean[] getArr(boolean ar[])
	{
		boolean b[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			b[i]=ar[i];
		}
		return b;
	}
}
public class Prog1 {

	public static void main(String[] args) {
		boolean ar[]= {true,true,false,false,true};
		boolean c[]=Array1.getArr(ar);
		for(boolean ele:c)
		{
			if(ele) {
			System.out.println(ele+",");
			}
		}
	}

}
