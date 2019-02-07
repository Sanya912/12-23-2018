package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstPages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.oxforddictionaries.com");

		WebElement re = driver.findElement(By.id("query"));
		re.sendKeys("bombed");
		re.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@data-value='GRAMMAR ']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@class='box-img']")).get(6).click();
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.id("user_email"))).build().perform();
		ac.contextClick(driver.findElement(By.id("user_email"))).build().perform();
		//driver.quit();

	}
}
