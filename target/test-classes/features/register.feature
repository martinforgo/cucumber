Feature: Test register functionality

  Scenario Outline: Register with correct datas
    Given I open the http://automationpractice.com page
    When I click on the Sign in button
    Then I redirect to the login page
    When I fill in the <email> credential
    And click on the register button
    Then I redirect to the register page
    When I fill in the <first_name> and <last_name> and <password> and <address> and <city> and <zip> and <mobile_phone> and <alias> fields on the register page
	And I select the <selected_state> option from the state select field on the register page
    Examples:
      | email 				| first_name | last_name | password | addr | city | zip | mobile_phone | alias 	| selected_state |
      | testtest@testtest.hu | test 	| test 		| 12Test34 | test | test | 1111 | 123456		| test_alias | Alaska	|
