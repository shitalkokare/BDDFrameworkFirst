Feature: Test orange HRM Application

  Scenario: test login functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button

  Scenario: test home page functionality
    Then user varify home page title
    And user varify home page logo
    And user varify home page url

  Scenario: test PIM Page functionality
    When user is on pim page
    Then validate user in PIM page using url

  Scenario: Create new user in PIM page
    When user click on Add button
    Then user is on Add Employee page
    Then user enter firstname and lastname
    Then user can capture employee id
    Then user click on save button

  Scenario: search PIM Page employee and delete employee
    When user click on employee list
    When user enter employee id number
    Then user click on search button
    And user click on checkbox
    And click on delete selected
    Then capture pop text
    Then click on yes delete button
