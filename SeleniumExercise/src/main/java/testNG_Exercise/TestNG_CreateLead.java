package testNG_Exercise;


import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_CreateLead {

	WebDriver driver;


	@BeforeMethod
	public void init() {
//		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		// TestLeaf Login Element Library
		WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement LOGIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//input[@value='Login']"));

	
		// Intractive Methods
		USERNAME_FIELD_ELEMENT.sendKeys("DemoSalesManager");
		PASSWORD_FIELD_ELEMENT.sendKeys("crmsfa");
		LOGIN_BUTTON_ELEMENT.click();
		
	
		String expectedTitle = "Leaftaps - TestLeaf Automation Platform";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong Page");

		WebElement CLICK_CRM_BUTTON_ELEMENT = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		CLICK_CRM_BUTTON_ELEMENT.click();

	}


	@Test(priority = 1)
	public void createLeadTest() {

		
		// HomePage Element
		WebElement CREATELEAD_ELEMENT = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		CREATELEAD_ELEMENT.click();

		String expectedTitleLeadPage = "Create Lead | opentaps CRM";
		String actualTitleLeadPage = driver.getTitle();
		Assert.assertEquals(actualTitleLeadPage, expectedTitleLeadPage, "Landing the Wrong Page");

	}
	

	@Test(priority = 2)
	public void leadPageTest() throws InterruptedException {


		// HomePage Element
		WebElement CREATELEAD_ELEMENT = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		CREATELEAD_ELEMENT.click();

		String expectedTitleLeadPage = "Create Lead | opentaps CRM";
		String actualTitleLeadPage = driver.getTitle();
		Assert.assertEquals(actualTitleLeadPage, expectedTitleLeadPage, "Landing the Wrong Page");
		
		// Lead Page Element Library
		
	//	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hema");
		WebElement COMPANY_NAME_ELEMENT = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		WebElement FIRST_NAME_ELEMENT = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		WebElement LAST_NAME_ELEMENT = driver.findElement(By.xpath("(//input[@name='lastName'])[3]"));
	
		// Drop Down Element
		WebElement SOURCE_ELEMENT = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		selectDropDown(SOURCE_ELEMENT, "Conference");

		WebElement LOCAL_FIRSTNAME_ELEMENT = driver.findElement(By.xpath("//input[@name='firstNameLocal']"));
		WebElement LOCAL_LASTNAME_ELEMENT = driver.findElement(By.xpath("//input[@name='lastNameLocal']"));
		WebElement BIRTHDATE_ELEMENT = driver.findElement(By.xpath("//input[@name='birthDate']"));
		WebElement TITLE_ELEMENT = driver.findElement(By.xpath("//input[@name='generalProfTitle']"));
		WebElement DEPARTMENT_ELEMENT = driver.findElement(By.xpath("//input[@name='departmentName']"));
		WebElement ANNUAL_REVENUE_ELEMENT = driver.findElement(By.xpath("//input[@name='annualRevenue']"));

		// Drop Down Element
		WebElement PREFERED_CURRENCY_ELEMENT = driver.findElement(By.xpath("//select[@name='currencyUomId']"));
		selectDropDown(PREFERED_CURRENCY_ELEMENT, "TRY - Turkish Lira");
		

		WebElement TEXTAREA_ELEMENT = driver.findElement(By.xpath("//textarea[@name='description']"));
		WebElement CREATE_LEAD_BUTTON_ELEMENT = driver.findElement(By.xpath("//input[@value='Create Lead']"));
	
	
		// Test Data
		String companyName = "MTA";
		String firstName = "MAMUN ";
		String lastName = "ATIA APA";
		String localFirstName = "Mamun";
		String localLastName = "Atia Apa";
		String birthDate = "01/01/1980";
		String title = "ABC";
		String department = "FOOD";
		String annualRevenue = "500000";
		String textArea = "First in First Out";

		
		// Intractive Methods

		int randomNum = randomgenerateNumber(999);
		
		COMPANY_NAME_ELEMENT.sendKeys(companyName);
		FIRST_NAME_ELEMENT.sendKeys(firstName + randomNum);
		LAST_NAME_ELEMENT.sendKeys(lastName);
		LOCAL_FIRSTNAME_ELEMENT.sendKeys(localFirstName);
		LOCAL_LASTNAME_ELEMENT.sendKeys(localLastName);
		BIRTHDATE_ELEMENT.sendKeys(birthDate);
		TITLE_ELEMENT.sendKeys(title);
		DEPARTMENT_ELEMENT.sendKeys(department);
		ANNUAL_REVENUE_ELEMENT.sendKeys(annualRevenue);
		TEXTAREA_ELEMENT.sendKeys(textArea);
		waitForElement(driver, 10, CREATE_LEAD_BUTTON_ELEMENT);
		CREATE_LEAD_BUTTON_ELEMENT.click();
	
	}
	
	@Test(priority = 3)
	public void editLead() {
		
		//Assertion
		
		String expectedTitle1 = "My Home | opentaps CRM";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1, "Landing the Wrong Page");

		// Lead Page Element library
		
			WebElement LEADS_BUTTON_ELEMENT = driver.findElement(By.linkText("Leads"));
			LEADS_BUTTON_ELEMENT.click();
			WebElement FINDLEAD_BUTTON_ELEMENT = driver.findElement(By.linkText("Find Leads"));
			FINDLEAD_BUTTON_ELEMENT.click();
			WebElement FIRSTNAME_ELEMENT = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
			FIRSTNAME_ELEMENT.sendKeys("Atia Apa");
			WebElement FIND_LEAD_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[text()='Find Leads']"));
			FIND_LEAD_BUTTON_ELEMENT.click();
			
	
	}
	
	
	@Test(priority = 4)
	public void deleteLead() {
		
	//Assertion
		
		String expectedTitle1 = "My Home | opentaps CRM";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1, "Landing the Wrong Page");

		// Lead Page Element library
		
	
			WebElement LEADS_BUTTON_ELEMENT = driver.findElement(By.xpath("//a[text()='Leads']"));
			LEADS_BUTTON_ELEMENT.click();
			WebElement FINDLEAD_BUTTON_ELEMENT = driver.findElement(By.xpath("//a[text()='Find Leads']"));
			FINDLEAD_BUTTON_ELEMENT.click();
		
			WebElement PHONE_BUTTON_ELEMENT = driver.findElement(By.xpath("//span[text()='Phone']"));
			PHONE_BUTTON_ELEMENT.click();
			WebElement INSERT_PHONE_AREA_CODE_ELEMENT = driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
			INSERT_PHONE_AREA_CODE_ELEMENT.sendKeys("123");
			WebElement INSERT_PHONE_NUMBER_ELEMENT = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
			INSERT_PHONE_NUMBER_ELEMENT.sendKeys("45698700");
	
	}
	

//RandomNuber
public int randomgenerateNumber(int bound) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(bound);
		return randomNumber;
		
	}


//DropDown 
public void selectDropDown(WebElement Element, String visibleText) {
	Select sel = new Select(Element);
	sel.selectByVisibleText(visibleText);
	
}


//Explicity wait
public void waitForElement(WebDriver driver, int TimeInSeconds, WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, TimeInSeconds);
	wait.until(ExpectedConditions.visibilityOf(element));
}


	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
