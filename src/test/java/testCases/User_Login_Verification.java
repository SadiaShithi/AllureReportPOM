package testCases;

import static org.junit.Assert.*;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_page;

public class User_Login_Verification extends Base {
	
	Login_page loginPage = new Login_page();
	
	@When("Click on Login Button")
	public void click_on_Login_Button() {
		loginPage.clickLoginBar();
	}

	@Then("Enter email - {string}")
	public void enter_userMail(String string) {
		loginPage.enterEmail(string);
	}

	@And("Enter password - {string}")
	public void enter(String string) {
		loginPage.enterPassword(string);
	}

	@And("Hit the Login Button")
	public void hit_the_Login_Button() {
		loginPage.clickLoginBtn();
	}

	@Then("Get Login Failed pop-up Message {string}")
	public void get_Login_Failed_pop_up_Message(String string) {
		
		String actualValue = loginPage.getLogintext();
		String expectedValue = string;
		
		assertEquals(expectedValue, actualValue);
	}

}
