package com.excel.assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class VegetablesName {

	public static void main(String[] args) {
		writeVegetables();
	}
	private static void writeVegetables()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook workbook=null;
		try 
		{
			fin=new FileInputStream("D:\\EXCEL\\ASS7.xlsx");
			workbook=new XSSFWorkbook(fin);
			Sheet readSheet=workbook.getSheet("Sheet1");
			Sheet writeSheet=workbook.createSheet("Vegetables");
			int row=readSheet.getPhysicalNumberOfRows();
			Row writeRow=writeSheet.createRow(4);
			
			for(int i=0;i<row;i++)
			{
				Row readRow=readSheet.getRow(i);
				
				int cell=readRow.getPhysicalNumberOfCells();
				
				for(int j=0;j<cell;j++)
				{
					Cell readCell=readRow.getCell(j);
					Cell writeCell=writeRow.createCell(i);
					if(readCell.getCellType()==CellType.BLANK) {
						writeCell.setCellValue(" ");
						
					}
					if(readCell.getCellType()==CellType.STRING) {
						writeCell.setCellValue(readCell.getStringCellValue());
						
					}
					if(readCell.getCellType()==CellType.NUMERIC) {
						writeCell.setCellValue(readCell.getStringCellValue());
					
					}
				}
			}
			fout=new FileOutputStream("D:\\EXCEL\\ASS7.xlsx");
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
