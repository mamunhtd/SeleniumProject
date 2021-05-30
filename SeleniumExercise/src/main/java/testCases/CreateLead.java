package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper {
	

	
	@Test
public void createLeadTest() {
	
	WebElement CREATELEAD_BUTTON = driver.findElement(By.linkText("Create Lead"));
	CREATELEAD_BUTTON.click();
	
	WebElement COMPANY_NAME = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
	COMPANY_NAME.sendKeys("xyz");
	
	WebElement FIRST_NAME = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
	FIRST_NAME.sendKeys("ABC");
	WebElement LAST_NAME = driver.findElement(By.xpath("(//input[@name='lastName'])[3]"));
	LAST_NAME.sendKeys("DEF");
	
	WebElement CREATELEAD_SUBMIT_BUTTON = driver.findElement(By.xpath("//input[@value='Create Lead']"));
	CREATELEAD_SUBMIT_BUTTON.click();
	
	WebElement EDIT_LEAD_BUTTON = driver.findElement(By.linkText("Edit"));
	EDIT_LEAD_BUTTON.click();
	
	
	
	
	
	
	// click create lead link
	//	driver.findElementByLinkText("Create Lead").click();

		// enter company name
	//	driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

		// enter FirstName
	//	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

		// enter lastName
	//	driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	
}

	

	
	

}
