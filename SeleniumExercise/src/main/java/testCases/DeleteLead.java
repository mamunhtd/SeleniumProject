package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class DeleteLead extends EditLead{
	
	/*
	 * WebDriver driver;
	 * 
	 * public DeleteLead(WebDriver driver) { this.driver = driver;
	 * 
	 * }
	 */

	@Test
	public void deleteLead() throws InterruptedException {
		
		EditLead editLead = new EditLead();
		editLead.editLead();
		
		WebElement DELETE_BUTTON = driver.findElement(By.linkText("Delete"));
		Thread.sleep(5000);
		DELETE_BUTTON.click();
		
	}
	
	

}
