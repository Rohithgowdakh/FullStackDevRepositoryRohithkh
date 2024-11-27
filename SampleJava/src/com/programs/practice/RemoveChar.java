package com.programs.practice;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res=removeER("HHAVVYSABBIKJAAJNAVTFREEEGSVCSRR");
		System.out.println(res);

	}

	public static String removeER(String str) {
		StringBuilder sb=new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i)=='A'||sb.charAt(i)=='E')
			{
				sb=sb.deleteCharAt(i);
			}
		}
		return sb.toString();
	}
}
