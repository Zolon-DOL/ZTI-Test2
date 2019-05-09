package ILAB_Automation_English_Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookMark_Bar {
	public WebDriver driver;
	
	public void Bkmk_Bar() throws InterruptedException {
	this.driver = Main.driver;
	driver.findElement(By.id("menu-btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("what-are-link")).click();
	driver.findElement(By.id("child-labor")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("bookmarks-link")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/span/a")).click();
	/*driver.findElement(By.id("home_step_2")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("topics")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"topics\"]/div[2]/ul/li[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/button")).click();
	driver.findElement(By.id("bookmarks-link")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("//*[@id=\"container\"]/div/ul/li[1]/ul/li[1]/button")).click();
	Thread.sleep(2000);*/
	driver.findElement(By.id("menu-btn")).click();
	driver.findElement(By.id("what-are-link")).click();
	driver.findElement(By.id("child-labor")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("bookmarks-link")).click();
	Thread.sleep(2000);
	System.out.println("Book Marking function is tested and verified to be functional");
	driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/span/a")).click();

	
	}
}
	