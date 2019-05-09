package ILAB_Automation_Spanish_Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class About_Button {
	
	public WebDriver driver;
	
	public void Abt_Btn() throws InterruptedException {
		this.driver = Main.driver;
		
		driver.findElement(By.id("about-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("bottom-drawer-about-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("why-develop")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("how-develop")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("who-app")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("how-use-app")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("about-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("bottom-drawer-findings-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("about-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("bottom-drawer-goods-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("navbar-left-items")).click();
		System.out.println("About Button is tested for all it pages and verified to be functional");
		
		
}
}