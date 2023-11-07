package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.BaseTest2;
import generic.Excel;

public class DemoTest extends BaseTest2 {

	@Test
	public void testDemo()
	{
		int r = Excel.getRowCount("./data/input.xlsx", "Sheet1");
		Reporter.log("Rowcount:"+r,true);
		
		String d = Excel.getData("./data/input.xlsx", "Sheet1",0,0);
		
		Reporter.log("Data:"+d,true);
		Reporter.log("test demo...",true);
//		Assert.fail();
		int c = Excel.getColCount("./data/input.xlsx", "Sheet1",0);
		Reporter.log("Cellcount:"+c,true);
		String s = Excel.setData("./data/input.xlsx", "Sheet1",0,0,"./data/newinput.xlsx");
		String d1 = Excel.getData("./data/newinput.xlsx", "Sheet1",0,0);
		Reporter.log("newData:"+d1,true);
		
	}
}
