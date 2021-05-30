package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class MergeLead extends CreateLead {
	/*
	 * WebDriver driver;
	 * 
	 * public MergeLead(WebDriver driver) { this.driver = driver;
	 * 
	 * }
	 */

	@Test
	public void mergeLead() throws InterruptedException {
		
		CreateLead createLead = new CreateLead();
		
	
		createLead.createLeadTest();
		
		
		WebElement MERGE_LEAD_BUTTON = driver.findElement(By.linkText("Merge Leads"));
		MERGE_LEAD_BUTTON.click();
		
		WebElement FROM_LEAD = driver.findElement(By.xpath("(//input[@type='text'])[29]"));
		FROM_LEAD.sendKeys("ATIA");
		
		WebElement TO_LEAD = driver.findElement(By.xpath("(//input[@type='text'])[30]"));
		TO_LEAD.sendKeys("MAMUN");
	}
	

}
