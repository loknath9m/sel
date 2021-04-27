Feature: Belly

  Background:

	Given I open browser
	And I logged in to application
Scenario: Validate register page abc
	
	When I click on register link
	Then I should see register page
	
	Scenario: Validate register page validation xyz
	
	When I click on register link
	Then I should see register page