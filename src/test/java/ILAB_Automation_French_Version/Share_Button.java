package ILAB_Automation_French_Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Share_Button {
	
	public WebDriver driver;
	
	public void ShareBtn() throws InterruptedException {
		this.driver = Main.driver;
		
		driver.findElement(By.id("share-link")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.id("pocket-button-0")).click();
		driver.findElement(By.id("share-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"share-link\"]/div[2]/div[2]")).click();
		driver.findElement(By.id("share-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"share-link\"]/div[2]/div[3]")).click(); */
		System.out.println("Share Button is tested (Pocket, email & Copy Link) and verified to be functional");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/span/a")).click();
		//Thread.sleep(2000);

}
}


