$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myaccount.feature");
formatter.feature({
  "line": 1,
  "name": "Account page",
  "description": "",
  "id": "account-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4918267200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User Register Account Successfully",
  "description": "",
  "id": "account-page;user-register-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@regression1"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User click on my account link",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User select my account option \"Register\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enter first name \"Dev\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enter last name \"Coldo\"",
  "keyword": "And "
});
formatter.match({
  "location": "LaptopAndNotebookSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 97689800,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.userClickOnMyAccountLink()"
});
formatter.result({
  "duration": 86915700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 31
    }
  ],
  "location": "MyAccountSteps.userSelectMyAccountOption(String)"
});
formatter.result({
  "duration": 20886221900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dev",
      "offset": 23
    }
  ],
  "location": "MyAccountSteps.userEnterFirstName(String)"
});
formatter.result({
  "duration": 126409800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Coldo",
      "offset": 22
    }
  ],
  "location": "LaptopAndNotebookSteps.userEnterLastName(String)"
});
formatter.result({
  "duration": 97470300,
  "status": "passed"
});
formatter.after({
  "duration": 758838200,
  "status": "passed"
});
});