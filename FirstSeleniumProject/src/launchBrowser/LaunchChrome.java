package launchBrowser;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mamun\\seleniumjava2021\\FirstSeleniumProject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement SignInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));

		userName.sendKeys("demo@techfios.com");
		password.sendKeys("abc123");
		SignInButton.click();

		Thread.sleep(5000);
		driver.close();

	}

}
