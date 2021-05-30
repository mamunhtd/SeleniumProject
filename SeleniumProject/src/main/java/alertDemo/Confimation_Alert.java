package alertDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confimation_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		
	//	driver.close();
	//	Thread.sleep(1000);
		
		
}
		

	}


