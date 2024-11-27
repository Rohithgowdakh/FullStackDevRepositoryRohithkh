package com.programs.practice;

public class ReverseNum {
	public static void main(String[] args) {
		int n=123456;
		String str=" "+n;
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
	}	
}
