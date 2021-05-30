package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateLeadPage extends ProjectSpecificWrapper{
	
	public CreateLeadPage enterCompanyName(String cName) {
		
		enterById("createLeadForm_companyName", cName);
		return this;
		
	}
	
	public CreateLeadPage enterFname(String fName) {
		
		enterById("createLeadForm_firstName", fName);
		return this;
		
	}
	
	public CreateLeadPage enterLname(String lname) {
		
		enterById("createLeadForm_lastName", lname);
		return this;
		
	}
	
	public CreateLeadPage enterFstNameLocal(String fnameLocal) {
		enterById("createLeadForm_firstNameLocal", fnameLocal);
		return this;
	}
	
	public Object enterLstNameLocal(String lnameLocal) {
		enterById("createLeadForm_lastNameLocal", lnameLocal);
		return this;
	}
	

	public ViewLeadPage clickCreateLeadButton() {
		
		clickByName("submitButton");
		return new ViewLeadPage();
	}

	
	
	

}
