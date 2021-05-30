package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {
	
	
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Click on- Try it Yourself
		driver.findElementByPartialLinkText("Try it Yourself »").click();

		//String currentWindow = driver.getWindowHandle();
		//System.out.println(currentWindow);
		
		//String FirstWin = driver.getWindowHandle();
		//System.out.println(FirstWin);
		
		Set<String> allWindow = driver.getWindowHandles();
		//System.out.println(allWin);
		
		for (String eachWindow : allWindow) {
			System.out.println(eachWindow);
			
			driver.switchTo().window(eachWindow);
			
			System.out.println(driver.getTitle());
		
			
			
	
	
	
	
	
	
	
	
		}
	
	
			
		}
		
	}
	


