package common_Methods;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Methods {
	

	//RandomNuber
	public int randomgenerateNumber(int bound) {
			Random rnd = new Random();
			int randomNumber = rnd.nextInt(bound);
			return randomNumber;
			
		}


	//DropDown 
	public void selectDropDown(WebElement Element, String visibleText) {
		Select sel = new Select(Element);
		sel.selectByVisibleText(visibleText);
		
	}


	//Explicity wait
	public void waitForElement(WebDriver driver, int TimeInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, TimeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}


	/*
	public static void takeElementScreenshots(WebElement element, String fileName) {
		File srcFile = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshots/"+ fileName +".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	*/

	/*
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		
	  TakesScreenshot ts = ((TakesScreenshot)driver);
	  SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
	  Date date = new Date();
	  String label = formatter.format(date);
	  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	  String currentDirectory = System.getProperty("user.dir");
	  FileUtils.copyFile(sourceFile, new File(currentDirectory +"/screenshots/" + label + ".png"));
	  
	 }
	*/

}
