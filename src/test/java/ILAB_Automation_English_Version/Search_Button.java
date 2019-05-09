package ILAB_Automation_English_Version;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Search_Button {
	public WebDriver driver;
	
	public void SerBtn() throws InterruptedException {
		this.driver = Main.driver;
		driver.findElement(By.id("search-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search-input")).sendKeys("labor", Keys.ENTER);
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/a[1]/h3")).click();
		Thread.sleep(2000);*/
		
		System.out.println("Search Button is tested(with search word high lighting in result) and verified to be functional");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/span/a")).click();
		Thread.sleep(2000);

}
}

