Feature: Login page Functionality Of Saucedemo Application


  
  Scenario Outline: Verify the Login Page Using Valid Credentials
    Given user is on the Login Page
    When user enters valid "<username>" and "<password>"
    And clicks on login button
    Then user navigates to Home Page
    And close the Browser
    
    Examples:
    
    | username      | password     |
    | standard_user | secret_sauce |
    
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
