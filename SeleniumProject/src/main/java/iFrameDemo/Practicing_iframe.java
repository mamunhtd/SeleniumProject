package iFrameDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicing_iframe {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		Iframe_Test1();
		Iframe_Test2();
		tearDown();

	}
	
	public static void Iframe_Test1() {
		
		  System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://jqueryui.com/selectable/");
		  //driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//a[text()='Selectable']")).click();
		  //driver.findElementByLinkText("Selectable").click();
	  
		  
//		   This is number # 1 Approch, If the frame has no ID or Name locator, then we can directly go to the index

		  driver.switchTo().frame(0); 
		 // driver.findElement(By.tagName("iframe")).getSize();
		 // System.out.println( driver.findElement(By.tagName("iframe")).getSize());
		  
		  driver.findElement(By.xpath("//ol[@id='selectable']/li[1]")).click();
		  driver.findElement(By.xpath("//ol[@id='selectable']/li[2]")).click();
		  driver.findElement(By.xpath("//ol[@id='selectable']/li[3]")).click();
		  driver.findElement(By.xpath("//ol[@id='selectable']/li[4]")).click();
		  driver.findElement(By.xpath("//ol[@id='selectable']/li[5]")).click();
		  driver.findElement(By.xpath("//ol[@id='selectable']/li[6]")).click();
		  driver.findElement(By.xpath("//ol[@id='selectable']/li[7]")).click();
		  driver.switchTo().parentFrame().getTitle();
		  System.out.println(driver.switchTo().parentFrame().getTitle());
		  
		  driver.findElement(By.partialLinkText("Demos")).click();
		  
		  driver.switchTo().parentFrame();
		  driver.close();


	}
	
	
	public static void Iframe_Test2() {
		

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		 This is number # 2 Approch, 
//		 If the frame has Id or name locator, then we can copy and paste id or name value into the code
//		 Syntax : driver.switchTo().frame("value");

		// driver.switchTo().frame("iframeResult");

//		This is number # 3 Approch,  
//		If the frame has a multiple index then go to the WebElement driver.findElementByLocator("value");
		
	

		 WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		 driver.switchTo().frame(iframe);
		 System.out.println("Successfully get into the iframe");
		 
		
		 WebElement first_name_ele = driver.findElement(By.xpath("//input[@value='John']"));
		 first_name_ele.clear();
		 first_name_ele.sendKeys("abc");
		 
		 WebElement last_name_ele = driver.findElement(By.xpath("//input[@value='Doe']"));
		 last_name_ele.clear();
		 last_name_ele.sendKeys("xyz");
		 
		 WebElement submit_button_ele = driver.findElement(By.xpath("//input[@type='submit']"));
		 submit_button_ele.click();
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().defaultContent();
		 	
	}
	
	public static void tearDown() throws InterruptedException {
		
		
		 driver.close();
		 driver.quit();
		 Thread.sleep(1000);
	}

}
