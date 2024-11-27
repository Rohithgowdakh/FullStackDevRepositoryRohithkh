package com.excel.assignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowerColor {

	public static void main(String[] args) {
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
			c.setCellValue("FLOWERS");
			c=row.createCell(1);
			c.setCellValue("COLORS");
			
			row=sh.createRow(1);
			c=row.createCell(0);
			c.setCellValue("LOTUS");
			c=row.createCell(1);
			c.setCellValue("Green");
			
			row=sh.createRow(2);
			c=row.createCell(0);
			c.setCellValue("Lotus");
			c=row.createCell(1);
			c.setCellValue("Black");
			
			row=sh.createRow(3);
			c=row.createCell(0);
			c.setCellValue("ROSE");
			c=row.createCell(1);
			c.setCellValue("White");
			
			row=sh.createRow(4);
			c=row.createCell(0);
			c.setCellValue("LOTUS");
			c=row.createCell(1);
			c.setCellValue("red");
			
			row=sh.createRow(5);
			c=row.createCell(0);
			c.setCellValue("ROSE");
			c=row.createCell(1);
			c.setCellValue("pink");
			
			row=sh.createRow(6);
			c=row.createCell(0);
			c.setCellValue("LOTUS");
			c=row.createCell(1);
			c.setCellValue("green");
			
			row=sh.createRow(7);
			c=row.createCell(0);
			c.setCellValue("ROSE");
			c=row.createCell(1);
			c.setCellValue("blue");
			
			row=sh.createRow(8);
			c=row.createCell(0);
			c.setCellValue("LOTUS");
			c=row.createCell(1);
			c.setCellValue("red");
			
			row=sh.createRow(9);
			c=row.createCell(0);
			c.setCellValue("Rose");
			c=row.createCell(1);
			c.setCellValue("pink");
			
			row=sh.createRow(10);
			c=row.createCell(0);
			c.setCellValue("Sunflower");
			c=row.createCell(1);
			c.setCellValue("purple");
			
			row=sh.createRow(11);
			c=row.createCell(0);
			c.setCellValue("Lily");
			c=row.createCell(1);
			c.setCellValue("grey");
			
			row=sh.createRow(12);
			c=row.createCell(0);
			c.setCellValue("Sunflower");
			c=row.createCell(1);
			c.setCellValue("geen");
			
			row=sh.createRow(13);
			c=row.createCell(0);
			c.setCellValue("Lily");
			c=row.createCell(1);
			c.setCellValue("orange");
			
			row=sh.createRow(14);
			c=row.createCell(0);
			c.setCellValue("Sunflower");
			c=row.createCell(1);
			c.setCellValue("pink");
			
			row=sh.createRow(15);
			c=row.createCell(0);
			c.setCellValue("Lily");
			c=row.createCell(1);
			c.setCellValue("brown");
			
			row=sh.createRow(16);
			c=row.createCell(0);
			c.setCellValue("Rose");
			c=row.createCell(1);
			c.setCellValue("red");
			
			row=sh.createRow(17);
			c=row.createCell(0);
			c.setCellValue("Sunflower");
			c=row.createCell(1);
			c.setCellValue("pink");
			
			row=sh.createRow(18);
			c=row.createCell(0);
			c.setCellValue("Lily");
			c=row.createCell(1);
			c.setCellValue("yellow");
			
			row=sh.createRow(19);
			c=row.createCell(0);
			c.setCellValue("Lotus");
			c=row.createCell(1);
			c.setCellValue("blue");
			
			fout=new FileOutputStream("D:\\EXCEL\\ASS4.xlsx");
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
