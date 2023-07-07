Feature: Search Result Page

Background: 
Given I visited the weburl

@epic4.1 @whole4 @search
Scenario: Properties should be availabe while searching

When I selected the rent option
Then I search location in the search bar
And Different properties option are available for selected location
And Property dealer contact options are available

@epic4.2 @whole4 @search
Scenario: Properties should be available for pg in search result page

When I selected the pg option
Then I search for the pg location
And I should be able to move to search result page
And contact details should be present