Feature: Search Functionalities 


Background: 
Given I visted the website url

@epic3.1 @wholeepic3
Scenario: Search is not possible without entering a location
When I clicked on the search bar
Then Without searching any location
Then clicking on the search button
And I should get an error message

@epic3.2 @wholeepic3
Scenario: Different locations are available
When I Search the location in the search bar
Then I was able to get different location options
And clear option should claer all the selected location
 



