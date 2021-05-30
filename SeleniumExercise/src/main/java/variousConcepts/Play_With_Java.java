package variousConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Play_With_Java {

	public static void main(String[] args) {

//		System.setProperty("WebDriver.chrome.driver", "\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
		
//		 WebDriverManager.firefoxdriver().setup();
//		 WebDriver driver = new FirefoxDriver(); 
//		 driver.get("https://www.google.com/");
		 
		 
		 
		 
		// System.out.println("Hello everyone");
		 
		
		// Print Hello World without Semicolon (;)
		
		 if (System.out.printf("Hello World" + "\n") == null) {

		}
		 
		if (System.out.append("Hello World" + "\n") == null) {

		}
		
		if (System.out.append("Hello World" + "\n").equals(null) ) {

		}
		
		System.out.println("________________________________");
		
		
		// Print 0 to 100 without define the Integer Number
		
		/*
		 * String s = "abcdefghij"; System.out.println(s.length());
		 * 
		 * System.out.println("________________________________");
		 * 
		 * 
		 * 
		 * int zero = s.length()-s.length(); //10-10 = 0; int hundred =
		 * s.length()*s.length(); // 10*10 = 100; for(int i=zero;i<=hundred; i++) {
		 * System.out.println(i);
		 * 
		 * }
		 * 
		 */
		
		
		String str = "Programing";
		System.out.println(str.length());
		int[] e = {1,2,3,5,4,5};
		System.out.println(e.length);
	
		int zero = str.length()-str.length();
		int hundred = str.length()*str.length();
		
		for (int i =zero; i<=hundred  ; i=i+10 ) {
			System.out.println(i);
			
		}
		
		
		
		
	}
}