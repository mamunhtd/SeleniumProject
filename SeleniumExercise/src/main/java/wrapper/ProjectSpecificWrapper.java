package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ProjectSpecificWrapper {
	

	public static WebDriver driver;
		
	@BeforeMethod
	public static WebDriver login() { 
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
	
		//maximize
	//	driver.manage().window().maximize();
		
		//load URL
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement USERNAME_TXT = driver.findElement(By.id("username"));
		USERNAME_TXT.sendKeys("DemoSalesManager");
		
		WebElement PASSWORD_TXT = driver.findElement(By.id("password"));
		PASSWORD_TXT.sendKeys("crmsfa");
		
		WebElement LOGIN_BUTTON = driver.findElement(By.xpath("//input[@value='Login']"));
		LOGIN_BUTTON.click();
		
		WebElement CRMSFA_BUTTON = driver.findElement(By.linkText("CRM/SFA"));
		CRMSFA_BUTTON.click();
		return driver;
		
	
		
		}
	
	@AfterMethod
	public static void closeBrowser() { 
		driver.close();
	}

}
