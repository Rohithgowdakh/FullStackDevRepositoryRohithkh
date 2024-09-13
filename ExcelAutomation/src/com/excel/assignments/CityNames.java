package com.excel.assignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CityNames {

	public static void main(String[] args) {
		getCityNames();
	}
	private static void getCityNames(){
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell c=null;
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet();
			row=sh.createRow(0);
			c=row.createCell(0);
			c.setCellValue("Hassan");
			row=sh.createRow(1);
			c=row.createCell(1);
			c.setCellValue("Mandya");
			row=sh.createRow(2);
			c=row.createCell(2);
			c.setCellValue("Bengaluru");
			row=sh.createRow(3);
			c=row.createCell(3);
			c.setCellValue("Thumakuru");
			row=sh.createRow(4);
			c=row.createCell(4);
			c.setCellValue("Belur");
			row=sh.createRow(5);
			c=row.createCell(5);
			c.setCellValue("Halebeedu");
			row=sh.createRow(6);
			c=row.createCell(6);
			c.setCellValue("K R Pete");
			row=sh.createRow(7);
			c=row.createCell(7);
			c.setCellValue("Nelamangala");
			row=sh.createRow(8);
			c=row.createCell(8);
			c.setCellValue("Hassan");
			row=sh.createRow(9);
			c=row.createCell(9);
			c.setCellValue("Raichuru");
			row=sh.createRow(10);
			c=row.createCell(10);
			c.setCellValue("Belagaum");
			row=sh.createRow(11);
			c=row.createCell(11);
			c.setCellValue("Bidar");
			row=sh.createRow(12);
			c=row.createCell(12);
			c.setCellValue("Yadgiri");
			row=sh.createRow(13);
			c=row.createCell(13);
			c.setCellValue("Chikkamagaluru");
			row=sh.createRow(14);
			c=row.createCell(14);
			c.setCellValue("Peenya");
			row=sh.createRow(15);
			c=row.createCell(15);
			c.setCellValue("Vijayanagara");
			row=sh.createRow(16);
			c=row.createCell(16);
			c.setCellValue("Sakaleshpura");
			row=sh.createRow(17);
			c=row.createCell(17);
			c.setCellValue("Arakalagudu");
			row=sh.createRow(18);
			c=row.createCell(18);
			c.setCellValue("Holenarasipura");
			row=sh.createRow(19);
			c=row.createCell(19);
			c.setCellValue("Jalahally");
			
			fout=new FileOutputStream("D:\\EXCEL\\ASS3.xlsx");
			wb.write(fout);
			}
			catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				wb.close();
				fout.close();
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
