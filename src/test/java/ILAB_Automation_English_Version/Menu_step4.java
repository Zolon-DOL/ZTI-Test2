package ILAB_Automation_English_Version;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu_step4 {
		public WebDriver driver;
		public void step4() throws InterruptedException {
			this.driver = Main.driver;
			Thread.sleep(3000);
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
			driver.findElement(By.id("next-step")).click();
			Thread.sleep(2000);
			System.out.println("STEP 4 is tested and verified");
			Thread.sleep(2000);

}
}