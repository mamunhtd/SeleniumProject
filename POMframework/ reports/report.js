$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automate leafTaps Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC003_CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "launch chromeBrowser and load url",
  "keyword": "Given "
});
formatter.step({
  "name": "enter userName as DemoSalesManager",
  "keyword": "And "
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "click CRMSFA",
  "keyword": "And "
});
formatter.step({
  "name": "click leads link",
  "keyword": "And "
});
formatter.step({
  "name": "click createlead",
  "keyword": "When "
});
formatter.step({
  "name": "enter the companyname as \u003ccompanyname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "enter the firstname as \u003cfirstname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "enter the lastname as \u003clastname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "choose source as Website",
  "keyword": "And "
});
formatter.step({
  "name": "click the createlead button",
  "keyword": "And "
});
formatter.step({
  "name": "its navigated Viewleadpage",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the firstname",
  "keyword": "And "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "companyname",
        "firstname",
        "lastname"
      ]
    },
    {
      "cells": [
        "TCS",
        "Hema",
        "Mali"
      ]
    },
    {
      "cells": [
        "ABC",
        "hema",
        "mali"
      ]
    },
    {
      "cells": [
        "XYZ",
        "hema",
        "mali"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC003_CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "launch chromeBrowser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.launchChromeBrowserAndLoadUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter userName as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterUserNameAsDemoSalesManager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickLeadsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click createlead",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.clickCreatelead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the companyname as TCS",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterTheCompanynameAsTCS(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the firstname as Hema",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterTheFirstnameAsHema(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the lastname as Mali",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterTheLastnameAsMali(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose source as Website",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.chooseSourceAsWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the createlead button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickTheCreateleadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Viewleadpage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.itsNavigatedViewleadpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.verifyTheFirstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC003_CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "launch chromeBrowser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.launchChromeBrowserAndLoadUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter userName as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterUserNameAsDemoSalesManager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickLeadsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click createlead",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.clickCreatelead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the companyname as ABC",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterTheCompanynameAsTCS(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the firstname as hema",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterTheFirstnameAsHema(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the lastname as mali",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterTheLastnameAsMali(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose source as Website",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.chooseSourceAsWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the createlead button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickTheCreateleadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Viewleadpage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.itsNavigatedViewleadpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.verifyTheFirstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC003_CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "launch chromeBrowser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.launchChromeBrowserAndLoadUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter userName as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterUserNameAsDemoSalesManager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickCRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickLeadsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click createlead",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.clickCreatelead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the companyname as XYZ",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterTheCompanynameAsTCS(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the firstname as hema",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterTheFirstnameAsHema(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the lastname as mali",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterTheLastnameAsMali(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose source as Website",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.chooseSourceAsWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the createlead button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickTheCreateleadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Viewleadpage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.itsNavigatedViewleadpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.verifyTheFirstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});