Feature:	To enter flight details

Scenario: To enter one way flight details

Given user selects the trip
And number of passengers
And departing from
When month "<month>" and date "<date>" is selected
And arriving in
Then preference is Economy class
When airline is "<Airline>"