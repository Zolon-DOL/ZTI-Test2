package ILAB.Automation_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class step2 {
	public WebDriver driver;
	

	@BeforeClass
	  public void beforeClass() {
	   
		  System.setProperty("webdriver.chrome.driver", "C:\\Aby\\Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		}
	
	@Test
	public void open_step2() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.id("learning-objectives")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("key-terms")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("topics")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"topics\"]/div[2]/ul/li[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("next-topic")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("next-topic")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("next-topic")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("cocoa-chains-acc")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("generic-import-description")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("next-topic")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("next-topic")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("next-topic")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("next-topic")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("next-step")).click();
	Thread.sleep(2000);
	System.out.println("STEP 2 is tested and verified");
}
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }
	
}
