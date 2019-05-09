package ILAB_Automation_English_Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu_step1 {
	public WebDriver driver;
	
	public void Step1() throws InterruptedException {
		this.driver = Main.driver;
		
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
	//	driver.findElement(By.id("resources")).click();
		
//		driver.findElement(By.id("next-step")).click();
		
	}

}
