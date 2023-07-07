Feature: Selection between Rent and Pg functionalities

Background: 
Given I visted the url

@epic2.1 @whole2 
Scenario: Rent option  should work properly

Given Rent option is selected
Then I was able to select different budget
And Also Bedroom slection is possible
And Also Posted By option should work
And clear all option sholuld clear all the selected details

@epic2.2 @whole2 
Scenario: Pg option should work properly

Given Pg option is available
Then I should able to select the budget option
And Available selction should work properly
Then I should able to select the sharing option
And Selection of dealer should function properly
And At last clear all function should work properly

