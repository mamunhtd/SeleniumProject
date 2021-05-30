package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLeadPage extends ProjectSpecificWrapper {
	

	public ViewLeadPage verifyTitleOfPage(String Title) {

		verifyTitle(Title);
		return this;

	}
	
	
	public OpenTapsCRMPage clickEdit() {

		clickByLinkText("Edit");
		return new OpenTapsCRMPage();

	}


	public ViewLeadPage verifyFName(String FName) {

		verifyTextByXpath("//input[@name='submitButton']", FName);
		return this;

	}
	
	public ViewLeadPage confirmChangeName(String fName) {
		
		verifyFName(fName);
		return this;	
	}


	public MyLeadsPage clickDelete() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object clickFindLeads() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object clickDuplicateLead() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
