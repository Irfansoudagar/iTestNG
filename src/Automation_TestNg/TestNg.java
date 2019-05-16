package Automation_TestNg;
import org.testng.annotations.Test;

import utility.*;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNg {
	
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("cnsd")).click();
	  driver.findElement(By.name("q")).sendKeys("test");
	  driver.findElement(By.name("q")).sendKeys(Keys.TAB);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  WebElement search = driver.findElement(By.name("btnK"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", search);
	  Log.info("testing this testng log4j configuration");
 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Irfan\\Downloads\\project selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/");
	  Log.info("testing this testng log4j configuration before method");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Log.info("testing this testng log4j configuration after method");
  }

}
