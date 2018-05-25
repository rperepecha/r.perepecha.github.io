package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewPostStep {
	@Given("^User is on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
	public void user_is_on_the_page_on_URL(String arg1, String arg2) throws Throwable {
		System.out.println("User is on VK main page");
	}

	@When("^User click on the \"([^\"]*)\" button$")
	public void user_click_on_the_button(String arg1) throws Throwable {
		System.out.println("User click to create new post");
	}

	@When("^And fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void and_fill_in_with(String arg1, String arg2) throws Throwable {
		System.out.println("User fill text ");
	}

	@Then("^User see new created post$")
	public void user_see_new_created_post() throws Throwable {
		System.out.println("User see new created post ");
	}




}
