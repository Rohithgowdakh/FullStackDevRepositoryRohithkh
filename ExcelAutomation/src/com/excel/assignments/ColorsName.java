package com.excel.assignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ColorsName {

	public static void main(String[] args) {
		
		getColors();
	}
	private static void getColors()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet();
			row=sh.createRow(9);
			c=row.createCell(0);
			c.setCellValue("Black");
			c=row.createCell(1);
			c.setCellValue("White");
			c=row.createCell(2);
			c.setCellValue("red");
			c=row.createCell(3);
			c.setCellValue("Brown");
			c=row.createCell(4);
			c.setCellValue("Green");
			c=row.createCell(5);
			c.setCellValue("Orange");
			c=row.createCell(6);
			c.setCellValue("Blue");
			c=row.createCell(7);
			c.setCellValue("Yellow");
			c=row.createCell(8);
			c.setCellValue("Pink");
			c=row.createCell(9);
			c.setCellValue("Purple");
			fout=new FileOutputStream("D:\\EXCEL\\ASS2.xlsx");
			wb.write(fout);	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	

}
