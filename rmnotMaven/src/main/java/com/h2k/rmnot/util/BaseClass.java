package com.h2k.rmnot.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	protected WebDriver driver;
	protected String url;

	@Parameters({"url","browserType"})
	@BeforeTest
	public void InvokeBrowser(String url, String browserType)
	{
		if(browserType.equals("FF"))
		{
			System.out.println("In FF");
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/test/resources/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if (browserType.equals("CH"))
		{
			System.out.println("In CH");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else
		{
		/* Two points to be taken care 1) Zoom should be 100%
		* 2) Enabled protected mode should be enable for all zones */
			System.out.println("In IE");
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/src/test/resources/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		this.url=url;
		}
	}
