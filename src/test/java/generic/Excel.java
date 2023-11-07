package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getData(String path,String sheet,int r,int c)
	{
		String v="";
		try 
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return v;
	}
	
	public static int getRowCount(String path,String sheet)
	{
		int rowCount=0;
		
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			rowCount=wb.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return rowCount;
	}
	
	public static String setData(String path,String sheet,int r,int c,String newpath)
	{
		String v="";
		try 
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			wb.getSheet("Sheet1").getRow(r).getCell(r).setCellValue("sunday");
	        wb.write(new FileOutputStream(newpath));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return v;
	}
	
	public static int getColCount(String path,String sheet,int r)
	{
		int colCount=0;
		
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			colCount=wb.getSheet(sheet).getRow(r).getLastCellNum();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return colCount;
	}
	
	//add a method to count columns
	
	//method to write the data
	
	
}
