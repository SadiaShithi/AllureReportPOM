#Author: Sadia Afroze Shithi

	@tag
	Feature: Shopping Functionalities Verification
  I want to verify the functionalities of the website

	Background: Open Browser and Visit the selected Site
	Given Redirect to "https://www.flipkart.com/"
	
  @tag1
  Scenario: Sort and List Items
    When Search an Item "TV"
    And Hit the search bar
    Then Sort Item by slider -75 px 
    And Make a List of Products on the Page 
    And Find the Most Expensive Item Among Those
    
  @tag2
 	Scenario Outline: User-Login Verification
    When Click on Login Button
    And Enter email - <email>
    And Enter password - <password>
    And Hit the Login Button
    Then Get Login Failed pop-up Message "You are not registered with us. please sign up."

   Examples: 
      | 			email  		| password |
      |	"user1@gmail.com" |	 "777777"	 |
      | "user2@gmail.com" |  "888888"  |
      | "user3@gmail.com" |  "999999"	 |