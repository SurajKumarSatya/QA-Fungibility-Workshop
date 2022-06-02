package selenium;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDrivers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String  browser = "edge";
		String url = "https://www.gmail.com";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriver driver = WebDriverManager.chromedriver().create();
			driver.navigate().to(url); 
			Thread.sleep(5000);
		}
		
		if(browser.equalsIgnoreCase("edge"))
		{
			WebDriver driver = WebDriverManager.edgedriver().create();
			driver.navigate().to(url);  
			Thread.sleep(5000);
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriver driver = WebDriverManager.firefoxdriver().create();
			driver.navigate().to(url); 
			Thread.sleep(5000);
		}
	}
}
