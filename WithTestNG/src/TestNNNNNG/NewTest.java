package TestNNNNNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
	@BeforeTest
	void invoke() {
		//String driverPath = "C:\\Windows\\System32\\chromedriver.exe";
		driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/interview.php");
	}

	@Test(groups = { "A" })
	public void f() {
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		String title = driver.getTitle();
		Assert.assertEquals(title, "QAClick Academy | Interview Guide");
	}

	@Test(groups = { "B" })
	public void f1() throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"tablist1-tab2\"]")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "QAClick Academy | Interview Guid");

	}

	@Test(groups = { "A" })
	public void f2() {
		System.out.println("Hello AA");
	}

	@Test(groups = { "C" })
	public void f3() {
		System.out.println("Hello CC");
	}

	@Test(groups = { "A" })
	public void f4() {
		System.out.println("Hello AA");
	}
}
