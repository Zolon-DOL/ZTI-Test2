package ILAB_Automation_French_Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Further_Resources {
	public WebDriver driver;
	public void furres() throws InterruptedException {
		this.driver = Main.driver;
		
		driver.findElement(By.id("home_basics")).click();
		driver.findElement(By.id("resources")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("navbar-left-items")).click();
		System.out.println("pass Basics Step");
		driver.findElement(By.xpath("//*[@id=\"home_step_1\"]/div[1]/div/div/span[2]/a")).click();
		driver.findElement(By.id("resources")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("navbar-left-items")).click();
		System.out.println("passed, step 1");
		driver.findElement(By.xpath("//*[@id=\"home_step_2\"]/div[1]/div/div/span[2]/a")).click();
		driver.findElement(By.id("resources")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("navbar-left-items")).click();
		System.out.println("passed, step 2");
		driver.findElement(By.xpath("//*[@id=\"home_step_3\"]/div[1]/div/div/span[2]/a")).click();
		driver.findElement(By.id("resources")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("navbar-left-items")).click();
		System.out.println("passed, step 3");
		driver.findElement(By.xpath("//*[@id=\"home_step_4\"]/div[1]/div/div/span[2]/a")).click();
		driver.findElement(By.id("resources")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("training")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("navbar-left-items")).click();
		System.out.println("passed, step 4");
		driver.findElement(By.xpath("//*[@id=\"home_step_5\"]/div[1]/div/div/span[2]/a")).click();
		driver.findElement(By.id("resources")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("navbar-left-items")).click();
		//driver.findElement(By.id("home_step_6")).click();
		//driver.findElement(By.id("breadcrumbs")).click();
		System.out.println("passed, step 5");
		System.out.println("Passed Step 6, no Further Resources page or Training page for step 6");
		driver.findElement(By.xpath("//*[@id=\"home_step_7\"]/div[1]/div/div/span[2]/a")).click();
		driver.findElement(By.id("resources")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("navbar-left-items")).click();
		System.out.println("passed, step 7");
		driver.findElement(By.xpath("//*[@id=\"home_step_8\"]/div[1]/div/div/span[2]/a")).click();
		driver.findElement(By.id("resources")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("navbar-left-items")).click();
		System.out.println("passed, step 8");
		System.out.println("All the pages are being tested and verified for Further Resources and Training Links");
		Thread.sleep(1000);
		System.out.println("=============================================================");
}
}
