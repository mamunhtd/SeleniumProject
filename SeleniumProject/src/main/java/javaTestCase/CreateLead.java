package javaTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The chrome browser launched successfully");
		

		// verify title of the page
		driver.getTitle();
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// enter password
		driver.findElementById("password").sendKeys("crmsfa");

		// click login
		driver.findElementByClassName("decorativeSubmit").click();

		// click CRM/SFA
		// Explicitly wait
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();

		driver.getTitle();
		System.out.println(driver.getTitle());

		// click create lead link
		driver.findElementByLinkText("Create Lead").click();

		// enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

		// enter FirstName
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

		// enter lastName
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		

		// enter title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
		
		//enter annual revenue
		//driver.findElementById("createLeadForm_annualRevenue").sendKeys("$123456");
		
		//enter number of employee
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");

		// enter description
		driver.findElementById("createLeadForm_description").sendKeys("It's a Software company");
		
		//enter note
		driver.findElementById("createLeadForm_importantNote").sendKeys("This is something amazing");

		// enter department
		driver.findElementById("createLeadForm_departmentName").sendKeys("mkt");
		
		//enter Areacode
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("14");
		
		//enter Extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("32");
		
		//enter ask for person
		driver.findElementByName("primaryPhoneAskForName").sendKeys("Mamun");;
		
		//enter phonenumber
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7894561230");
		
		//enter Email
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		
		//enter Url
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
		
		//enter address name
	//	driver.findElementByName("generalToName").sendKeys("abc Home");
		
		//enter addressline1
		//driver.findElementByName("generalAddress1").sendKeys("8675 Midland Pkwy");
		
		//enter city
		//driver.findElementById("createLeadForm_generalCity").sendKeys("Jamaica");
		
		//enterpostal code
	//	driver.findElementByName("generalPostalCode").sendKeys("11432");
	

		// click create lead btn
		driver.findElementByName("submitButton").click();
		
		// Explicitly wait
				Thread.sleep(2000);
		//click Logout
		driver.findElementByLinkText("Logout").click();
		
		
		// close browser
//		driver.close();

	}
	
	//select source-(DropDown)
	
		

}
