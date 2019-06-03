package ILAB.Automation_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ILAB_SpanishVersion {
	public WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "C:\\Aby\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("http://localhost:3000");
	}

	@Test
	//MENU
	public void open_Menu() throws InterruptedException {
		
		 driver.get("http://54.210.154.145:8085/");
		//driver.get("http://54.81.86.222:8085/");
		driver.manage().window().maximize();
		System.out.println("=============================================================");
		System.out.println("Comply Chain Application for U.S Department of Labor");
		System.out.println(" Developed by Zolon Tech INC");
		System.out.println("Quality Assurance & Automation");
		System.out.println("QA Analyst: Aby Chalil");
		System.out.println("Report to Ms.Saliha Keddache (Project Manager)");
		System.out.println("=============================================================");
		System.out.println("TEST REPORT & TEST STATUS");
		System.out.println("ILAB - SPANISH VERSION");
		System.out.println("Application Loading....");
		System.out.println("Test Begins...");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.id("menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("es-btn")).click();
		// clicks on the what-are-links
		driver.findElement(By.id("what-are-link")).click();
		System.out.println("What are child labor and Forced labor page is tesed and verfied to be working");
		Thread.sleep(2000);
		// clicks on the child labor
		driver.findElement(By.id("child-labor")).click();
		Thread.sleep(2000);
		// javaScript command
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		driver.findElement(By.id("forced-labor")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("why-develop-link")).click();
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
//STEP 1		
		driver.manage().window().maximize();
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
		//STEP 2:
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
		driver.findElement(By.id("cocoa-chains-acc")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("generic-import-description")).click();
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
		System.out.println("STEP 2 is tested and verified");
		//STEP 3:
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
		driver.findElement(By.id("next-topic")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("next-step")).click();
		Thread.sleep(2000);
		System.out.println("STEP 3 is tested and verified");
		Thread.sleep(2000);
//STEP 4
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
//STEP 5
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
		driver.findElement(By.id("next-topic")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("next-topic")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("next-topic")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("next-step")).click();
		Thread.sleep(2000);
		System.out.println("STEP 5 is tested and verified");
		Thread.sleep(2000);
//STEP 6
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
		driver.findElement(By.id("next-step")).click();
		Thread.sleep(2000);
		System.out.println("STEP 6 is tested and verified");
		Thread.sleep(2000);
//STEP 7
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
		driver.findElement(By.id("next-step")).click();
		Thread.sleep(2000);
		System.out.println("STEP 7 is tested and verified");
		Thread.sleep(2000);
//STEP 8
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
		
//PROGRESS BAR
		System.out.println("Progress Bar functionality is tested and Verified to be working correctly");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/span/a")).click();
		

		//BOOKMARKING
				driver.findElement(By.id("menu-btn")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("what-are-link")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/button")).click();
				// //*[@id=\"container\"]/div[1]/button
				Thread.sleep(2000);
				driver.findElement(By.id("menu-btn")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("basics-link")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("breadcrumbs")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"home_step_2\"]/div[1]/div/div/span[2]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("breadcrumbs")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"home_step_2\"]/div[1]/div/div/span[2]/a")).click();
				driver.findElement(By.id("topics")).click();
				driver.findElement(By.xpath("//*[@id=\"topics\"]/div[2]/ul/li[2]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("bookmarks-link")).click();
				Thread.sleep(4000);
				
				//driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/span/a")).click();
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
				Thread.sleep(2000);
				driver.findElement(By.id("menu-btn")).click();
				driver.findElement(By.id("what-are-link")).click();
				driver.findElement(By.id("bookmarks-link")).click();
				driver.findElement(By.id("menu-btn")).click();
				driver.findElement(By.id("child-labor")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("bookmarks-link")).click();
				Thread.sleep(2000);*/
				System.out.println("Book Marking function is tested and verified to be functional");
				driver.findElement(By.id("breadcrumbs")).click();
		//SEARCH
				driver.findElement(By.id("search-link")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("search-input")).sendKeys("labor");
				//selenium.keyPressNative(Keys.ENTER.toString());
				Thread.sleep(2000);
				/*driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/a[1]/h3")).click();
				Thread.sleep(2000);*/
				System.out.println("Search Button is tested(with search word high lighting in result) and verified to be functional");
				Thread.sleep(2000);
				driver.findElement(By.id("breadcrumbs")).click();
				Thread.sleep(2000);
		//SHARE
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
				
		//ABOUT
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
				Thread.sleep(5000);
			}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}


}
