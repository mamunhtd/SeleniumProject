package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//load URL
		driver.get("http://leaftaps.com/opentaps");

		//maximize browser window
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();

		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		//Print current title
		System.out.println(driver.getTitle());

		//Enter Username 
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button 
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

		//click create lead link
		driver.findElementByLinkText("Create Lead").click();

		// company name
	//	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("MTA");
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("MTA");
	//	driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

		// enter firstName						
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");

		// enter lastName
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
		// driver.findElementById("createLeadForm_lastName").sendKeys("J");

		//select source-(DropDown)
		
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select slt = new Select(src);
		slt.selectByVisibleText("Partner");
		
		//Select MKT
		WebElement mktcam = driver.findElementById("createLeadForm_marketingCampaignId");
		Select slt1 = new Select(mktcam);
		slt1.selectByValue("CATRQ_CARNDRIVER");
		
		//Select INd
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select slt2 = new Select(ind);
		slt2.selectByIndex(7);
		
		// select ownership
		WebElement ownship = driver.findElementById("createLeadForm_ownershipEnumId");
		Select slt3 = new Select(ownship);
		slt3.selectByVisibleText("Corporation");
		
		//Select currency
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select slt4 = new Select(currency);
		slt4.selectByValue("USD");
		
		//select state
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select slt5 = new Select(state);
		slt5.selectByValue("NY");
		
		
		//Select country
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select slt6 = new Select(country);
		slt6.selectByVisibleText("United States");
		
		//click
		driver.findElementByName("submitButton").click();
		
		
		
		Thread.sleep(4000);
	//	driver.close();
		
		
	}
	
	
}