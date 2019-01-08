package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.oxforddictionaries.com");
		
		driver.findElement(By.id("query")).sendKeys("bombed");
		driver.findElement(By.id("query")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-value='GRAMMAR ']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@class='box-img']")).get(6).click();
		JavascriptExecutor jss = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		driver.quit();
		
	
	}

}
