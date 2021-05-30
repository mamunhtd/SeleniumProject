package alertDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_Practicing {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//Simple Alert test
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try {
			
			WebElement Submit_Element = driver.findElement(By.xpath("(//input[@id='searchBtn'])[1]"));
			Submit_Element.click();
			//Submit_Element.clear();
			
			String Simple_Alert_Text = driver.switchTo().alert().getText();
			System.out.println(Simple_Alert_Text);
			
			driver.switchTo().alert().accept();
			
			//System.out.println("Executing code is good");
		}
		
		catch(Exception a) {
		
			System.out.println("Wait, Something went wrong");
			
		}
		
		finally {
			System.out.println("Test case 1.");
		}
		
		
		driver.close();
		driver.quit();
		Thread.sleep(2000);
		
		
	
		//Confirmation Alert Test
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//driver.findElement(By.linkText("CRM/SFA"));
		
		System.out.println(driver.getTitle());
		
		try {
			
			WebElement Create_Lead_Ele = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
			Create_Lead_Ele.click();
				System.out.println(driver.getTitle());

			WebElement Merge_Lead_Ele = driver.findElement(By.xpath("//a[contains(text(),'Merge Leads')]"));
			Merge_Lead_Ele.click();
				System.out.println(driver.getTitle());

			WebElement Merge_Ele = driver.findElement(By.xpath("//a[text()='Merge']"));
			Merge_Ele.click();
			
			String Confirm_Alert_Text = driver.switchTo().alert().getText();
			System.out.println(Confirm_Alert_Text);
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			
			//System.out.println("Executing code is good");
			
		}
		catch(Exception e) {
			System.out.println("Wait, Something went wrong");
			
		}
		
		finally {
			System.out.println("Tset case 2.");
		}
		
		
		
		driver.close();
		driver.quit();
		Thread.sleep(2000);
		
	
		
		//Prompt Alert Test
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		try {
			
			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			
			Alert Prompt_Alert = driver.switchTo().alert();
			Prompt_Alert.getText();
			System.out.println(Prompt_Alert.getText());
			Thread.sleep(1000);
			Prompt_Alert.sendKeys("Print Prompt Alert");
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			
		    driver.findElement(By.id("result")).getText();
			System.out.println(driver.findElement(By.id("result")).getText());
		//	System.out.println("Executing code is good");
			
		}
		catch(Exception e) {
			System.out.println("Wait, Something went wrong");
			
		}
		
		finally {
			System.out.println("Test case 3.");
		}
		
		System.out.println("Hello");
		
		driver.close();
		driver.quit();
		Thread.sleep(1000);
		
	
		
	}

}
