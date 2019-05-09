package ILAB.Automation_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class step1{
	public WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
	   
		  System.setProperty("webdriver.chrome.driver", "C:\\Aby\\Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		}
	
	
	@Test
	public void open_step1() throws InterruptedException{
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("steps-dropdown")).click();
		Thread.sleep(2000);
		//step 1
		driver.findElement(By.id("step-1-link")).click();
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
		driver.findElement(By.id("next-topic")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("next-topic")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("next-step")).click();
		Thread.sleep(2000);
		System.out.println("STEP 1 is tested and verified");
		Thread.sleep(2000);
	/*/	driver.findElement(By.id("resources")).click();
		 <class name="ILAB.Automation_Test.step1"/>
	       <class name="ILAB.Automation_Test.step2"/>
//		driver.findElement(By.id("next-step")).click();
*/		
	}
	
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }

}
	