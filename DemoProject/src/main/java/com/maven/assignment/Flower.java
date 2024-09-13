package com.maven.assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Flower {

	public static void main(String[] args) {
		
		getFlowers();
	}
	private static void getFlowers()
	{
		FileWriter fout=null;
		FileReader read=null;
		CSVReader reader=null;
		CSVWriter write=null;
		try
		{
			read=new FileReader("D:\\CSV_Files\\ASS1.csv");
			fout=new FileWriter("D:\\CSV_Files\\ASS2.csv");
			write=new CSVWriter(fout);
			reader=new CSVReader(read);
			String data[]=null;
			while((data=reader.readNext())!=null)
			{
				for(int i=0;i<data.length;i++)
				{
					System.out.println(data[i]+" ");
				}
			}
			String header[]= {"fruits"};
			write.writeNext(header);
			String row1[]= {"mango"};
			write.writeNext(row1);
			String row2[]= {"Apple"};
			write.writeNext(row2);
			String row3[]= {"Grapes"};
			write.writeNext(row3);
			String row4[]= {"Apple1"};
			write.writeNext(row4);
			String row5[]= {"mango"};
			write.writeNext(row5);
			String row6[]= {"Grapes"};
			write.writeNext(row6);
			String row7[]= {"mango1"};
			write.writeNext(row7);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				write.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
