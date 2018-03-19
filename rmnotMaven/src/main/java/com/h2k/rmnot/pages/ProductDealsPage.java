package com.h2k.rmnot.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDealsPage {
	
	WebDriver driver;
	
	public ProductDealsPage (WebDriver driver)  //constructor
	{
		this.driver=driver;
	}
	
	public int getCategoryCount(String catName, String catNameId)
	{
		
		driver.findElement(By.linkText(catName)).click();
		List<WebElement> catList = driver.findElements(By.xpath("//section[@id='"+catNameId+"']/div/div"));

		System.out.println("Number of Element in Category" +catName+ " is :::" + catList.size());
		return 1;
	}
}
