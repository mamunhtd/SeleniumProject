package learn_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	
	
	//Remember in TestNG we didn't use Main Method, for execution @Test will help 
		@BeforeSuite
	//Remember @ Annotation's First Letter Will be Upper Case, After use 1st ANNOTATION @BeforeSuite 2nd step will need to write Customize Method and try to give the name of it as Class Name 
	//Method will be lower case and method name's starting letter will be lower
		
		
		
		public void TestNG_Annotations() {
			
		System.out.println("1st Annotation @BeforeSuite of Pre Condition Run Only One Time ");
		
		}
		
	    @BeforeTest
	    public void secondAnnotaion() {
	    	
	    	System.out.println("2nd Annotation @BeforeTest of Pre Condition will Run Only One Time");
	    }
		
	    @BeforeClass
	    	public void thirdAnnotation() {
	    	
	    	System.out.println("3rd Annotation @BeforeClass of Pre Condition will Run Only One Time");	
	    	
	    }
	    
	 // Remember 4th Annotation @Before Method will Run Base on @Test will use how many times which is depend, how many test case will run, if Test Case 2 then @Test will be 2 and 4th Annotation will run 2 times    
	    @BeforeMethod
	    public void fourthAnnotation() {
	    	
	    	System.out.println("4th Annotation @Before Method of Pre Condition will Run depend on how many @Test or TestCase will Execute");
	    	
	    }
	    
	    @Test  //Exception if Priority not mention, this will be the first Priority for Execution  
	    public void test1() {
	    	
	    	System.out.println("5th Annotation @Test will run Depend on test case, Test 1 Create Lead ");
	    	
	    }
	    @Test (priority = 0) //Remember lowest priority is the Highest when every test case will be Prioritize for execution)
	    public void test2() {
	    	
	    	System.out.println("Test 2 Find Leads");
	    	
	    }
	    
	    @Test (priority = 2)
	    public void test3() {
	    	
	    	System.out.println("Test 3 will be Merge Leads");
	    }
	    
	    @AfterMethod
	    public void sixAnnotation () {
	    	
	    	System.out.println("6th Annotation @AfterMethod of Post Condition will Run depend on how many @Test or TestCase will Execute");
	    }
	    
	    @AfterClass
	    public void sevenAnnotation () {
	    	
	    	System.out.println("7th Annotation @AfterClass of Post Condition will run only one time");
	    }
	    
	    @AfterTest
	    public void eightAnnotation() {
	    	
	    	System.out.println("8th Annotation @AfterTest of Post Condition will run only one time");
	    }
	    @AfterSuite
	    public void NineAnnotation() {
	    	
	    	System.out.println("9th Annotation @AfterSuite of post condition will run one time ");

	    }
}