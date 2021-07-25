Feature: Login to customer portal
  
 
  Scenario: Successful login when user logs in with valid login credentials 
	    Given I am on the cutomer login page 
	    When 	I provide valid login credentials
	    And 	I click on login button 
	    Then  I should be redirected to home page 
	    
  
