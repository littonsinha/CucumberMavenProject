$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/com/newtours/qa/features/Login.feature");
formatter.feature({
  "name": "Demo Tours Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Demo Tours Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.newtours.qa.stepdefinition.Login.user_is_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "username and password are entered",
  "keyword": "And "
});
formatter.match({
  "location": "com.newtours.qa.stepdefinition.Login.username_and_password_are_entered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "com.newtours.qa.stepdefinition.Login.user_clicks_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
});