package com.excel.assignments;

import java.io.FileInputStream;  
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountryName {

	public static void main(String[] args) {
		getCountry();
	}
	private static void getCountry()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook workbook=null;
		try
		{
			fin = new FileInputStream("D:\\EXCEL\\ASS8.XLSX");
			workbook = new XSSFWorkbook(fin);
			Sheet oldS = workbook.getSheet("Sheet1");
			Sheet newS = workbook.createSheet("Country+Capital");
			int a = oldS.getPhysicalNumberOfRows();
			Row row4 = newS.createRow(3);
			Row row5 = newS.createRow(4);
			Cell newC=null;
			int k=0;
			for (int i = 0; i < a; i++) {
				
				Row oldR = oldS.getRow(i);
				int b = oldR.getPhysicalNumberOfCells();
				for (int j = 0; j < b; j++) {
					Cell oldC = oldR.getCell(j);
					 
					if(j%2==0) {
					newC= row4.createCell(k);
					}else {
					newC=row5.createCell(k);
					}
					if (oldC.getCellType() == CellType.BLANK) {
						newC.setCellValue(" ");
						
					} else if (oldC.getCellType() == CellType.STRING) {
						newC.setCellValue(oldC.getStringCellValue());
					
					} else if (oldC.getCellType() == CellType.NUMERIC) {
						newC.setCellValue(oldC.getNumericCellValue());
						
					}

				}
				k=k+1;
			}
			fout=new FileOutputStream("D:\\EXCEL\\ASS8.xlsx");
			workbook.write(fout);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				workbook.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
