package ILAB_Automation_English_Version;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DOL_Menu {
	
	public WebDriver driver;
	public void Menu() throws InterruptedException {
		this.driver = Main.driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//finds the menu 
		driver.findElement(By.id("menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("en-btn")).click();
		//clicks on the what-are-links
		driver.findElement(By.id("what-are-link")).click();
		System.out.println("What are child labor and Forced labor page is tesed and verfied to be working");
		Thread.sleep(2000);
		//clicks on the child labor 
		driver.findElement(By.id("child-labor")).click();
		Thread.sleep(2000);
		//javaScript command
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		driver.findElement(By.id("forced-labor")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("why-develop-link")).click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.id("exec-order")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("trade-act")).click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.id("uk-slave-act")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("france-dov-law")).click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.id("wall-street-prot-act")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cali-supply-chain-act")).click();
		Thread.sleep(2000);
		System.out.println("Why develop a social Compliance Page is tested and verified");
		driver.findElement(By.id("menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("basics-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("learning-objectives")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("key-terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("topics")).click();
		System.out.println("Basics of a Social Compliance Page is tested and verified");
		Thread.sleep(2000);
	}

}
