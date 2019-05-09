package ILAB_Automation_French_Version;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Aby\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://54.81.86.222:8085/");
		Thread.sleep(2000);
		System.out.println("=============================================================");
		System.out.println("Comply Chain Application for U.S Department of Labor");
		System.out.println(" Developed by Zolon Tech INC");
		System.out.println("Quality Assurance & Automation");
		System.out.println("QA Analyst: Aby Chalil");
		System.out.println("=============================================================");
		System.out.println("TEST REPORT & TEST STATUS");
		System.out.println("ILAB - FRENCH VERSION");
		System.out.println("Application Loading....");
		Thread.sleep(2000);
		System.out.println("Test Begins...");
		Thread.sleep(1000);
		DOL_Menu m= new DOL_Menu();
		m.Menu();
		Menu_step1 s1 = new Menu_step1();
		s1.Step1();
		Menu_step2 s2 = new Menu_step2();
		s2.step2();
		Menu_step3  s3= new Menu_step3();
		s3.step3();
		Menu_step4  s4= new Menu_step4();
		s4.step4();
		Menu_step5  s5= new Menu_step5();
		s5.step5();
		Menu_Step6  s6= new Menu_Step6();
		s6.step6();
		Menu_step7  s7= new Menu_step7();
		s7.step7();
		Menu_step8  s8= new Menu_step8();
		s8.step8();
		Navigation_Bar n1 = new Navigation_Bar();
		n1.Nav_Bar();
		BookMark_Bar B1 = new BookMark_Bar();
		B1.Bkmk_Bar();
		Search_Button sb1 = new Search_Button();
		sb1.SerBtn();
		Share_Button Shb1 = new Share_Button();
		Shb1.ShareBtn();
		About_Button abbtn = new About_Button();
		abbtn.Abt_Btn();
		Further_Resources fr1 = new Further_Resources();
		fr1.furres();
		System.out.println("Test Successful-French Version. END OF TESTING!!");
			  Date objDate = new Date();
			  System.out.println(objDate.toString());
			  driver.findElement(By.id("breadcrumbs")).click();
				Thread.sleep(2000);	
	}

}
