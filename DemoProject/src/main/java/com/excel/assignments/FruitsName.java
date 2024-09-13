package com.excel.assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FruitsName {

	public static void main(String[] args) {
		getFruits();
	}

	private static void getFruits() {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		Workbook workbook = null;
		try {
			fin = new FileInputStream("D:\\EXCEL\\ASS6.XLSX");
			workbook = new XSSFWorkbook(fin);
			Sheet oldS = workbook.getSheet("Sheet1");
			Sheet newS = workbook.createSheet("Fruit sheet2");
			int a = oldS.getPhysicalNumberOfRows();
			for (int i = 0; i < a; i++) {
				Row oldR = oldS.getRow(i);
				Row newR = newS.createRow(i);
				int b = oldR.getPhysicalNumberOfCells();
				for (int j = 0; j < b; j++) {
					Cell oldC = oldR.getCell(j);
					Cell newC = newR.createCell(j);
					if (oldC.getCellType() == CellType.BLANK) {
						newC.setCellValue(" ");
					} else if (oldC.getCellType() == CellType.STRING) {
						newC.setCellValue(oldC.getStringCellValue());
					} else if (oldC.getCellType() == CellType.NUMERIC) {
						newC.setCellValue(oldC.getNumericCellValue());
					}

				}
			}
			fout=new FileOutputStream("D:\\EXCEL\\ASS6.XLSX");
			workbook.write(fout);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				fout.close();
				workbook.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
