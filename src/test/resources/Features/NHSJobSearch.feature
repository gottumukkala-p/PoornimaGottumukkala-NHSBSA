Feature: Feature to test NHS job search functionality

  Scenario: Job search by title and order jobs by latest date posted
    Given user is on nhs job search page
    When user enters title into what field
    And clicks on search button
    Then user is navigated to the results page
    And results sorted by newest Date Posted
    
  Scenario: Job search by location and order jobs by latest date posted
    Given user is on nhs job search page
    When user enters location into where field
    And clicks on search button
    Then user is navigated to the results page
    And  results sorted by newest Date Posted
    
  Scenario: Job search by title & employer and order jobs by latest date posted
    Given user is on nhs job search page
    When user enters title into what field
    And user enters employer name into Employer field
    And clicks on search button
    Then user is navigated to the results page
    And results sorted by newest Date Posted
    
   Scenario: Job search by title & salary range and order jobs by latest date posted
    Given user is on nhs job search page
    When user enters title into what field
    And user selects payrange from dropdown
    And clicks on search button
    Then user is navigated to the results page
    And results sorted by newest Date Posted
    
   Scenario: Negative scenario to test search functionality with incorrect job location
    Given user is on nhs job search page
    When user enters incorrect location into where field
    And clicks on search button
    Then user is displayed with message 'Location not found'
    
    