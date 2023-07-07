Feature: Filter option under search result page

Background:
Given I visited the web application

@whole5  @sc5.1
Scenario: Rent property should be visible according to the filter
When I search different location in the search bar under rent option
And filter was set as per the need 
Then Property with the selected checkboxes should be visible

@whole5 @sc5.2
Scenario: Pg property should be visible according to the filter
When I Search location for the pg
And set different filter according to the requirement
Then I should be able to get filtered pg only
