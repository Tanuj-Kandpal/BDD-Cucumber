Feature: Selecting and Viewing different option

Background: 
Given I visited the website
Then I click on the rentpg option

@homepage
Scenario: I should able to select All resedential properties
And I was able to select all residentials drop down options

@homepage
Scenario: I should able to select commercial propertities
And I should able to select commercial properties

@homepage
Scenario: Rent option should work properly
Then I was able to select different budget
And Also Bedroom slection is possible
And Also Posted By option should work
And clear all option sholuld clear all the selected details

@homepage
Scenario: Pg option should work properly
And Pg option is available
Then I should able to select the budget option
And Available selction should work properly
Then I should able to select the sharing option
And Selection of dealer should function properly
And At last clear all function should work properly

@homepage
Scenario: Search is not possible without entering a location
When I clicked on the search bar
Then Without searching any location
Then clicking on the search button
And I should get an error message

@homepage
Scenario: Different locations are available
When I Search the location in the search bar
Then I was able to get different location options
And clear option should claer all the selected location