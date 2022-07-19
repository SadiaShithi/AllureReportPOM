#Author: Sadia Afroze Shithi

@tag
Feature: Shopping Functionalities Verification
  I want to verify the functionalities of the website
	
	Background: Go to selected website
	
  @tag1
  Scenario: Sort and List Items
    Given I am redirecting to "https://www.flipkart.com/"
    When Search an Item "TV"
    And Hit the search bar
    Then Sort Item by slider -75 px 
    And Make a List of Products on the Page 
    And Find the Most Expensive Item Among Those

  #@tag2
# Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step
#
#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
