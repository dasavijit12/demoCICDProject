package com.automation.cicd.demoSeleniumProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {

	WebDriver driver;
	String url = "https://www.google.com";
@BeforeTest
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver_v119\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().fullscreen();
}
	
  @Test
  public void TestGoogle() {
	  String expectedTitle = "Google";
	  driver.get(url);
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @Test
  public void TestGoogle1() {
	  String expectedTitle = "Google1";
	  driver.get(url);
	  String actualTitle = driver.getTitle();
	  System.out.println("Title of the page is : "+actualTitle);
	  //Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @AfterTest
  public void tearDown() {
	  driver.close();
	  driver.quit();
  }
}
