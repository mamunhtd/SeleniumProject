package javaTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateLead1 {

	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				".\\driver\\chromedriver.exe");
//		C:\\Users\\mamun\\seleniumjava2021\\SeleniumProject\\driver\\chromedriver.exe
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement Username = driver.findElement(By.name("USERNAME"));
		WebElement Password = driver.findElement(By.name("PASSWORD"));

		sendkeys(driver, Username, 10, "DemoSalesManager");
		sendkeys(driver, Password, 5, "crmsfa");
		
	
		
	//	WebElement Login = driver.findElement(By.className("decorativeSubmit"));
	//	WebElement VisiableLink = driver.findElementByLinkText("CRM/SFA");
		//WebElement Click = driver.findElementByClassName("decorativeSubmit");
		
		
	//	clickOn(driver, Login, 10);
	//	clickOn(driver, VisiableLink, 5);


	}

	public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
