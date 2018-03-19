package com.h2k.rmnot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)  //constructor
	{	
		this.driver=driver;
	}

	public ProductDealsPage navigateToProductDeals() {
		
		//Click on Gift Card Deals
		driver.findElement(By.xpath(".//*[@id='top']/div/nav/ul/li[3]/a/span")).click();		
		driver.findElement(By.xpath(".//*[@id='top']/div/nav/ul/li[1]/div/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='top']/div/nav/ul/li[1]/div/div/ul/li[4]/a")).click();
		
		ProductDealsPage dealspage = new ProductDealsPage(driver);
		return dealspage;
	}

	
		
	
}
