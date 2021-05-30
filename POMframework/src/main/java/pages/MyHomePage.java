package pages;

import wrapper.ProjectSpecificWrapper;

public class MyHomePage extends ProjectSpecificWrapper{
	
	public MyLeadsPage clickLeadslink() {
		
		clickByLinkText("Leads");
		return new MyLeadsPage();
		
	}

}
