package com.excel.assignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PersonName {

	public static void main(String[] args) {
		getPersonsName();
	}
	private static void getPersonsName() {
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
			c=row.createCell(9);
			c.setCellValue("ROHITH SHARMA");
			row=sh.createRow(1);
			c=row.createCell(9);
			c.setCellValue("SHIKHAR-DHAWAN");
			row=sh.createRow(2);
			c=row.createCell(9);
			c.setCellValue("VIRAT-KOHLI");
			row=sh.createRow(3);
			c=row.createCell(9);
			c.setCellValue("MS-DHONI");
			row=sh.createRow(4);
			c=row.createCell(9);
			c.setCellValue("RAVINDRA-JADEJA");
			row=sh.createRow(5);
			c=row.createCell(9);
			c.setCellValue("R-ASHWIN");
			row=sh.createRow(6);
			c=row.createCell(9);
			c.setCellValue("M-SIRAJ");
			row=sh.createRow(7);
			c=row.createCell(9);
			c.setCellValue("BUMRAH");
			row=sh.createRow(8);
			c=row.createCell(9);
			c.setCellValue("KL-RAHUL");
			row=sh.createRow(9);
			c=row.createCell(9);
			c.setCellValue("H-SINGH");
			row=sh.createRow(10);
			c=row.createCell(9);
			c.setCellValue("S-GILL");
			row=sh.createRow(11);
			c=row.createCell(9);
			c.setCellValue("R-PANTH");
			row=sh.createRow(12);
			c=row.createCell(9);
			c.setCellValue("JAISWAL");
			row=sh.createRow(13);
			c=row.createCell(9);
			c.setCellValue("ABHISHEK");
			row=sh.createRow(14);
			c=row.createCell(9);
			c.setCellValue("SURYAKUMAR");
			row=sh.createRow(15);
			c=row.createCell(9);
			c.setCellValue("HARDIK-PANDYA");
			row=sh.createRow(16);
			c=row.createCell(9);
			c.setCellValue("K-PANDYA");
			row=sh.createRow(17);
			c=row.createCell(9);
			c.setCellValue("KAPILDEV");
			row=sh.createRow(18);
			c=row.createCell(9);
			c.setCellValue("ANIL-KUMBLE");
			row=sh.createRow(19);
			c=row.createCell(9);
			c.setCellValue("RAHUL-DRAVID");
			
			fout=new FileOutputStream("D:\\EXCEL\\ASS5.xlsx");
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
