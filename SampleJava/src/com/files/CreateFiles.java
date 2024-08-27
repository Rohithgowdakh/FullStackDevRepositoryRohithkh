package com.files;
import java.io.File;
import java.io.IOException;

public class CreateFiles {

	public static void main(String[] args) {
		getFiles();
		 renameFile();
		 deleteFile();
		 fileColletion();
	}
	private static void getFiles()
	{
		File f1=new File("D:\\Demo\\FirstFile3.txt");
		try {
			boolean v1=f1.createNewFile();
			System.out.println("is file created :"+v1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void renameFile() {
		File f1=new File("D:\\Demo\\FirstFile.txt");
		File f2=new File("D:\\demo\\SecondFile.txt");
		boolean v1=f1.renameTo(f2);
		System.out.println("is file renamed :"+v1);
		
	}
	private static void deleteFile() {
		File f1=new File("D:\\demo\\FirstFile2.txt");
		boolean v1=f1.delete();
		System.out.println("is file deleted :"+v1);
	}
	private static void fileColletion() {
		File f1=new File("D:\\demo");
		File f[]=f1.listFiles();
		for(int i=0;i<f.length;i++)
		{
			if(f[i].isFile()==true)
			{
				String path=f[i].getAbsolutePath();
				System.out.println(path);
			}
		}
	}

}
