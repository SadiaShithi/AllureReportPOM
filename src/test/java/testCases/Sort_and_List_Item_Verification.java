package testCases;
import java.util.concurrent.TimeUnit;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Landing_Page;

public class Sort_and_List_Item_Verification extends Base {
	
	Landing_Page landingPage = new Landing_Page();
	
	@Given("Redirect to {string}")
	public void i_am_redirecting_to(String string) {
		getURL(string);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		landingPage.closePopUp();
	}

	@When("Search an Item {string}")
	public void search_an_item(String string) {
		landingPage.searchItem(string);
	}

	@When("Hit the search bar")
	public void hit_the_search_bar() {
		landingPage.hitSearch();
	}

	@Then("Sort Item by slider {int} px")
	public void sort_item_by_slider_px(Integer px) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		landingPage.slideMe(px);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("Make a List of Products on the Page")
	public void make_a_list_of_products_on_the_page() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		landingPage.makeList();
	}

	@Then("Find the Most Expensive Item Among Those")
	public void find_the_most_expensive_item_among_those() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    landingPage.expensiveItem();
	}
	
}
