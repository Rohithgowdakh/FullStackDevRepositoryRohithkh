package com.files;

import java.io.File;

public class FolderOperations {

	public static void main(String[] args) {
	createFolder();
//		nestedFolder();
	//	renameFolder();
//		folderCollection();
		deleteFolder();
	}
	private static void createFolder() {
		File f1=new File("D:\\Demo10\\demo11\\demo13");
		boolean v1=f1.mkdirs();
		System.out.println("is folder created :"+v1);
	}
	private static void nestedFolder() {
		File f1=new File("D:\\Demo1\\Demo2\\Demo3\\Demo4\\Demo5");
		boolean v11=f1.mkdirs();
		System.out.println("Nested folders created :"+v11);
	}
	private static void renameFolder() {
		File f1=new File("D:\\Demo1\\Demo2\\Demo3\\Demo4");
		File f2=new File("D:\\Demo1\\Demo2\\Demo3\\renameDemo4");
		boolean v12=f1.renameTo(f2);
		System.out.println("is folder renamed :"+v12);
		
	}
	private static void deleteFolder() {
		File f1=new File("D:\\Demo10\\demo11\\demo13");
		boolean v13=f1.delete();
		System.out.println("deleted ? :"+v13);
	}
	private static void folderCollection() {
		File f1=new File("D:\\Demo1");
		File f[]=f1.listFiles();
		for(int i=0;i<f.length;i++) {
			if(f[i].isDirectory()==true) {
				String s1=f[i].getAbsolutePath();
				System.out.println("path name :"+s1);
			}
		}
	}

}
