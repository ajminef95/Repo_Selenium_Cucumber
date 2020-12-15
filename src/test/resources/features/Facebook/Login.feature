Feature: Login


  Scenario: User gets invalid credentials
    When I enter 'ab@test.com' in username box
    And I enter 'wrongPassword' in password box
    And I click on the Login Button
    Then I see the error message for wrong credentials