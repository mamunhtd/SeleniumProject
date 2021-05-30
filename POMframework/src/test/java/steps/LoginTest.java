package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest {
	ChromeDriver driver;
	
	@Given("launch chromeBrowser and load url")
	public void launchChromeBrowserAndLoadUrl() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The chrome browser launched successfully");
	
	}

	@Given("enter userName as (.*)")
	public void enterUserNameAsDemoSalesManager(String uname) {
		
		driver.findElementById("username").sendKeys(uname);
   
	}

	
	@Given("enter password as (.*)")
	public void enterPasswordAsCrmsfa(String pwd) {
		
		driver.findElementById("password").sendKeys(pwd);
	    
	}

	@When("click the login button")
	public void clickTheLoginButton() {
		
		driver.findElementByClassName("decorativeSubmit").click();
  
	}

	@Then("it is navigated homepage")
	public void itIsNavigatedHomepage() {
		
		System.out.println(driver.getTitle());
	  
	}

	@Then("click the logout button")
	public void clickTheLogoutButton() {
		
		driver.findElementByClassName("decorativeSubmit").click();
	 
	}
	

@Given("enter userName as Mamun")
public void enterUserNameAsMamun() {
	driver.findElementById("username").sendKeys("Mamun");
}

@Then("it is navigated samepage")
public void itIsNavigatedSamepage() {
	
	System.out.println(driver.getTitle());
   
}

@Then("verify error massage")
public void verifyErrorMassage() {
    String errorMassage = driver.findElementById("errorDiv").getText();
	if(errorMassage.contains("Mamun")) {
		System.out.println("Error massage is match");
	}else {
		System.out.println("Error massage is not match");
	}
}


@Given("click CRMSFA")
public void clickCRMSFA() {
	driver.findElementByLinkText("CRM/SFA").click();

	
}

@Given("click leads link")
public void clickLeadsLink() {
	
	driver.findElementByLinkText("Leads").click();

}

@When("click createlead")
public void clickCreatelead() {
	
	driver.findElementByLinkText("Create Lead").click();
}

@When("enter the companyname as (.*)")
public void enterTheCompanynameAsTCS(String cname) {
	
	driver.findElementById("createLeadForm_companyName").sendKeys(cname);
    
}

@When("enter the firstname as (.*)")
public void enterTheFirstnameAsHema(String fname) {
	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
  
}

@When("enter the lastname as (.*)")
public void enterTheLastnameAsMali(String lname) {
	
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
}

@When("choose source as Website")
public void chooseSourceAsWebsite() {
	
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		dd.selectByVisibleText("Website");
  
}

@When("click the createlead button")
public void clickTheCreateleadButton() {
	driver.findElementByName("submitButton").click();
	
}

@Then("its navigated Viewleadpage")
public void itsNavigatedViewleadpage() {
	
 System.out.println(driver.getTitle());
	
}

@Then("verify the firstname")
public void verifyTheFirstname() {
	String firstname = driver.findElementById("viewLead_firstName_sp").getText();
	if(firstname.equals("Hema")) {
		System.out.println("First Name is Match");
	}else {
		System.out.println("First Name is Not Match");
		
	}
}



@Then("close browser")
public void closeBrowser() {
  driver.close();
}


}
