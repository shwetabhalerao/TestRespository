package com.h2k.rmnot.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.h2k.rmnot.pages.HomePage;
import com.h2k.rmnot.pages.ProductDealsPage;
import com.h2k.rmnot.util.BaseClass;
import com.h2k.rmnot.util.Utility;

import jxl.read.biff.BiffException;

public class RMTests extends BaseClass 

{
	
	@DataProvider(name="DP")
	public String[][] FeedDP() throws BiffException, IOException
	{
		String arr[][] = Utility.readxlsfile();
		return arr;
	}
		
	@Parameters({"categoryName","categoryNameId","categoryCount"})
	@Test (priority=1) // Run this test using input form .xml file
	public void verifyCategoryCount (String categoryName, String categoryNameId, String categoryCount) {
	
	try{
	driver.get(url);
	HomePage hpage = new HomePage(driver);
	ProductDealsPage dealsPage = hpage.navigateToProductDeals();
	int actual = dealsPage.getCategoryCount(categoryName,categoryNameId);
	int expected = Integer.parseInt(categoryCount);
	Assert.assertEquals(actual, expected);
	}
	catch(Exception e){}
	}
		
	@Test(priority=2, dataProvider="DP")// Run this test using input form Excel .xls file
	public void verifyAllCategoryCount (String categoryName, String categoryNameId, String categoryCount) {
	
	try{
	driver.get(url);
	HomePage hpage = new HomePage(driver);
	ProductDealsPage dealsPage = hpage.navigateToProductDeals();
	int actual = dealsPage.getCategoryCount(categoryName,categoryNameId);
	int expected = Integer.parseInt(categoryCount);
	Assert.assertEquals(actual, expected);
	}
	catch(Exception e){}
	}
	
	@Test(priority=3)
	public void tc3()
	{}
	
	
}
