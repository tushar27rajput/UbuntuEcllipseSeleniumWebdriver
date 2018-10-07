package com.jxlConcepts;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Test1 
{

	public static void main(String[] args) throws Exception, IOException 
	{
		//connect to Excel File
		File f = new File("/home/rajput/Documents/Book1.xls");

		//open that Excel file for Reading
		Workbook rwb = Workbook.getWorkbook(f);
		
		Sheet rsh = rwb.getSheet(0); // o Means Sheet 1
		
		int nour = rsh.getRows();
		
		//Open Excel file for writing 
		WritableWorkbook wwb = Workbook.createWorkbook(f, rwb);
		WritableSheet wsh = wwb.getSheet(0);
		
		//Data Driven from 2nd ROW (Index is 1)
		
		for(int i=1;i<nour;i++)
		{
			int x = Integer.parseInt(rsh.getCell(0,i).getContents());
			
			int y = Integer.parseInt(rsh.getCell(1,i).getContents());
			
			int z = x+y;
			
			Number n = new Number(2,i,z);
			wsh.addCell(n);
			
		}
		
		//Save Excel File
		wwb.write();
		rwb.close();
		wwb.close();
		
	}

}
