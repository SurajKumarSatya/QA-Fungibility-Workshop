package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.navigate().to("https://www.opencart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();   // to refresh
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();  //to click on register button
		Thread.sleep(3000);
		driver.navigate().back();  // to perform backward operation
		Thread.sleep(3000);
		driver.navigate().forward();   // to perform forward operation
		Thread.sleep(3000);
	}
	
	
}
