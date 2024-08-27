package com.files;

import java.io.File;

public class FileDetailsDemo {

	public static void main(String[] args) {
		 getDetails();
	}
	private static void getDetails() 
	{
		File f1=new File("D:\\Demo\\FirstFile3.txt");
		//Display FileName
		String name=f1.getName();
		System.out.println("name of file :"+name);
		//Display path
		String path=f1.getAbsolutePath();
		System.out.println("path name :"+path);
		//Display file path
		File f2=f1.getAbsoluteFile();
		System.out.println("path name :"+f2);
		//Verify whether that is folder
		boolean v1=f1.isFile();
		System.out.println("is file :"+v1);
		
		boolean v2=f1.isDirectory();
		System.out.println("is directory :"+v2);
		
		String path1=f1.getParent();		
		System.out.println("parent path :"+path1);
		
		boolean v11=f1.canRead();
		System.out.println("can read this file :"+v11);
		
		boolean v12=f1.canWrite();
		System.out.println("can write this file :"+v12);
		
		boolean v13=f1.canExecute();
		System.out.println("can execute this file :"+v13);
		
	}
}
