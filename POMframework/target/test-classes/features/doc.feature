Feature: Automate leafTaps Application

@smoke
Scenario Outline: TC001_LoginLogout

Given launch chromeBrowser and load url
And enter userName as <username>
And enter password as <password>
When click the login button
Then it is navigated homepage
And click the logout button
And close browser

Examples:
	|username|password|
	|DemoSalesManager|crmsfa|
	|DemoCSR|crmsfa|

@smoke
Scenario: TC002_LoginLogout for Failure

Given launch chromeBrowser and load url
And enter userName as Mamun
And enter password as crmsfa
When click the login button
Then it is navigated samepage
But verify error massage

@wip
Scenario Outline: TC003_CreateLead

Given launch chromeBrowser and load url
And enter userName as DemoSalesManager
And enter password as crmsfa
And click the login button
And click CRMSFA
And click leads link 
When click createlead
And enter the companyname as <companyname>
And enter the firstname as <firstname>
And enter the lastname as <lastname>
And choose source as Website 
And click the createlead button
Then its navigated Viewleadpage
And verify the firstname
And close browser


Examples:
	|companyname|firstname|lastname|
	|TCS|Hema|Mali|
	|ABC|hema|mali|
	|XYZ|hema|mali|





















