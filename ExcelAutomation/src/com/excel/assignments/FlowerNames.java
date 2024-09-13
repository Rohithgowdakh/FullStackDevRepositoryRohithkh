package com.excel.assignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowerNames {

	public static void main(String[] args) {
		getFlower(); 

	}
	
	private static void getFlower() 
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
			row=sh.createRow(0);
			c=row.createCell(0);
			c.setCellValue("ROSE");
			row=sh.createRow(1);
			c=row.createCell(0);
			c.setCellValue("LOTUS");
			row=sh.createRow(2);
			c=row.createCell(0);
			c.setCellValue("Lotus");
			row=sh.createRow(3);
			c=row.createCell(0);
			c.setCellValue("ROSE");
			row=sh.createRow(4);
			c=row.createCell(0);
			c.setCellValue("LOTUS");
			row=sh.createRow(5);
			c=row.createCell(0);
			c.setCellValue("ROSE");
			row=sh.createRow(6);
			c=row.createCell(0);
			c.setCellValue("LOTUS");
			row=sh.createRow(7);
			c=row.createCell(0);
			c.setCellValue("ROSE");
			row=sh.createRow(8);
			c=row.createCell(0);
			c.setCellValue("LOTUS");
			row=sh.createRow(9);
			c=row.createCell(0);
			c.setCellValue("Rose");
			row=sh.createRow(10);
			c=row.createCell(0);
			c.setCellValue("Sunflower");
			row=sh.createRow(11);
			c=row.createCell(0);
			c.setCellValue("Lily");
			row=sh.createRow(12);
			c=row.createCell(0);
			c.setCellValue("Sunflower");
			row=sh.createRow(13);
			c=row.createCell(0);
			c.setCellValue("Lily");
			row=sh.createRow(14);
			c=row.createCell(0);
			c.setCellValue("Sunflower");
			row=sh.createRow(15);
			c=row.createCell(0);
			c.setCellValue("Lily");
			row=sh.createRow(16);
			c=row.createCell(0);
			c.setCellValue("Rose");
			row=sh.createRow(17);
			c=row.createCell(0);
			c.setCellValue("Sunflower");
			row=sh.createRow(18);
			c=row.createCell(0);
			c.setCellValue("Lily");
			row=sh.createRow(19);
			c=row.createCell(0);
			c.setCellValue("Lotus");
			
			fout=new FileOutputStream("D:\\EXCEL\\ASS1.xlsx");
			wb.write(fout);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fout.close();
				wb.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
