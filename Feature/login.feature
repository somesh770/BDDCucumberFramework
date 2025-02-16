Feature: Login Functionality

  Scenario: Check login with Valid Email and password
    Given User Navigate to LoginPage
    When User Enter Valid Email as "admin@yourstore.com" and Password as "admin"
    And User Click on Login button
    Then User should navigate to Dashboard

  
