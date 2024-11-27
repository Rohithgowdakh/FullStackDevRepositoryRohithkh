package com.programs.practice;

import java.io.FileInputStream;

public class FileReadFindDCount {
	
	static void readDCount() {
		FileInputStream fin=null;
		int res=0;
		int count=0;
		try {
			fin=new FileInputStream("D:\\Demo\\SearchD.txt");
			while((res=fin.read())!=-1) 
			{
//				if(res==-1) break;
				if((char)res=='D') 
				{
					count++;
				}
			}
			System.out.println(count);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		readDCount();
	}

}
