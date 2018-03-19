package com.h2k.rmnot.util;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Utility {
	public static String[][] readxlsfile() throws BiffException, IOException {		
		File f = new File(System.getProperty("user.dir")+"/src/test/resources/dealsData.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh[]=wb.getSheets();
		System.out.println("No. of Sheets: "+ sh.length);
		
		Sheet sheet = wb.getSheet(0);
		int rows = sheet.getRows();
		int cols = sheet.getColumns();
		String data[][]= new String[rows][cols];

		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				Cell cell = sheet.getCell(j,i);
				data[i][j]=cell.getContents();
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		return data;
		}
}
