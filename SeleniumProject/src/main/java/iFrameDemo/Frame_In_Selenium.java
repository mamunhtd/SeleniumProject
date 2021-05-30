package iFrameDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		//driver.get("https://jqueryui.com/selectable/");
		
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//way-1 -Enter into the frame
		//driver.switchTo().frame("iframeResult");
		
		//way-2
		//driver.switchTo().frame(0);
		
		//way-3		
		WebElement iframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(iframe);
		
		//OR				
		//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
		System.out.println("Successfully enter into the frame");
							
		driver.findElementByXPath("//input[@value='John']").clear();
		driver.findElementByXPath("//input[@value='John']").sendKeys("Emad");
		
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='lname']").clear();
		driver.findElementByXPath("//input[@id='lname']").sendKeys("Eva");
		
		//driver.findElementByXPath("//input[@id='fname']").sendKeys("Atia");
		
		//driver.findElementByXPath("//input[@value='John']").clear();
		//driver.findElementByXPath("//input[@value='John']").sendKeys("Mamun");
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
