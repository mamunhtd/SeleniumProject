package alertDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Submit_Element = driver.findElement(By.xpath("(//input[@id='searchBtn'])[1]"));
		Submit_Element.click();
		
		String Simple_Alert_Text = driver.switchTo().alert().getText();
		System.out.println(Simple_Alert_Text);
		
		driver.switchTo().alert().accept();
		
		driver.close();
		driver.quit();
		Thread.sleep(2000);
		
	
		
	}

}
