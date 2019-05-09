package ILAB_Automation_English_Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu_step8 {
	public WebDriver driver;
	public void step8() throws InterruptedException {
		this.driver = Main.driver;
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
		System.out.println("STEP 8 is tested and verified");
		Thread.sleep(2000);

}

}
