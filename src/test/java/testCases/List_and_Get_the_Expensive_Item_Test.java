package testCases;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Landing_Page;

public class List_and_Get_the_Expensive_Item_Test extends Base {

	Landing_Page landingPage = new Landing_Page();

	@Given("I am redirecting to {string}")
	public void i_am_redirecting_to(String string) {
		getURL(string);
		landingPage.closePopUp();
	}

	@When("Search an Item {string}")
	public void search_an_item(String string) {
		landingPage.searchItem(string);
	}

	@When("Hit the search bar")
	public void hit_the_search_bar() throws InterruptedException {
		landingPage.hitSearch();
		Thread.sleep(5000);
	}

	@Then("Sort Item by slider {int} px")
	public void sort_item_by_slider_px(Integer px) throws InterruptedException {
		landingPage.slideMe(px);
		Thread.sleep(5000);
	}

	@Then("Make a List of Products on the Page")
	public void make_a_list_of_products_on_the_page() {
		landingPage.makeList();
	}

	@Then("Find the Most Expensive Item Among Those")
	public void find_the_most_expensive_item_among_those() throws InterruptedException {
		landingPage.expensiveItem();
		Thread.sleep(5000);
	}

}
