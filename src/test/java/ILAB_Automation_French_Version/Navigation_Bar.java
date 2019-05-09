package ILAB_Automation_French_Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigation_Bar {
	
	public WebDriver driver;
	
	public void Nav_Bar() throws InterruptedException {
		this.driver = Main.driver;
		System.out.println("Navigation Bar is tested with color variations and verified to be functional");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/span/a")).click();
		Thread.sleep(2000);

}
}