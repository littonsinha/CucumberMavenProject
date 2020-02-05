Feature:	To enter flight details

@SmokeTest
Scenario: To enter one way flight details for first quarter

#Given user is already on login page
And username and password are entered
When user clicks on signin button
And user creates a trip
#Then user closes the browser

@RegressionTest
Scenario: To enter one way flight details for second quarter

Given user is already on login page
And username and password are entered
When user clicks on signin button
And user creates a trip
Then user closes the browser

@RegressionTest
Scenario: To enter one way flight details for third quarter

Given user is already on login page
And username and password are entered
When user clicks on signin button
And user creates a trip
Then user closes the browser

@RegressionTest
Scenario: To enter one way flight details for fourth quarter

Given user is already on login page
And username and password are entered
When user clicks on signin button
And user creates a trip
Then user closes the browser