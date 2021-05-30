package alertDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Alert {

	public static void main(String[] args) throws InterruptedException {
		

			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();

			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			System.out.println(driver.getTitle());
							
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

			//By using Alert class
			Alert PromptAlert = driver.switchTo().alert();
			
			PromptAlert.getText();
			System.out.println(PromptAlert.getText());
			Thread.sleep(3000);
			PromptAlert.sendKeys("This is a Prompt Alert");
			Thread.sleep(3000);
			PromptAlert.accept();
			
			//driver.findElement(By.id("result")).getText();
			driver.findElement(By.id("result")).getText();
			//System.out.println(driver.findElement(By.id("result")).getText()); 
			System.out.println(driver.findElement(By.id("result")).getText());
			
			
			

	

	}

}
