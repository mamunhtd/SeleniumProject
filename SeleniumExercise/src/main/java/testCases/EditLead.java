package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class EditLead extends ProjectSpecificWrapper  {
	
//	WebDriver driver;
//	
//	public EditLead(WebDriver driver) {
//		this.driver = driver;
//	}
//	
	
	
	@Test
	public void editLead() throws InterruptedException {
		
		ProjectSpecificWrapper.login();
		
		CreateLead createLead = new CreateLead();
		createLead.createLeadTest();
		
	
		
		
		
			WebElement EDIT_LEAD_COMPANYNAME = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
			Thread.sleep(5000);
			EDIT_LEAD_COMPANYNAME.sendKeys("TCS");

			WebElement EDIT_LEAD_FIRSTNAME = driver.findElement(By.xpath("//input[@id='updateLeadForm_firstName']"));
			EDIT_LEAD_FIRSTNAME.sendKeys("Hema");
			
			
			WebElement EDIT_LEAD_LASTNAME = driver.findElement(By.xpath("//input[@id='updateLeadForm_lastName']"));
			EDIT_LEAD_LASTNAME.sendKeys("Mali");
			
			WebElement UPDATE_BUTTON = driver.findElement(By.xpath("//input[@value='Update']"));
			UPDATE_BUTTON.click();
			
			
	//		ProjectSpecificWrapper.closeBrowser();
		
		
		
		
	}

	
	

}
