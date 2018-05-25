package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditStep {



@Given("^User is on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
public void user_is_on_the_page_on_URL(String arg1, String arg2) throws Throwable {
	System.out.println("User is on main page");
}

	@When("^User click on the \"([^\"]*)\" button$")
	public void user_click_on_the_button(String arg1) throws Throwable {
		System.out.println("User click on the pull-down menu button");
	}

	@When("^Click on the \"([^\"]*)\" button$")
	public void click_on_the_button(String arg1) throws Throwable {
		System.out.println("User click on the 'Редактировать' button ");
	}

	@When("^User fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void user_fill_in_with(String arg1, String arg2) throws Throwable {
		System.out.println("User enter changed text");
	}

	@Then("^And user click on the \"([^\"]*)\" button$")
	public void and_user_click_on_the_button(String arg1) throws Throwable {
		System.out.println("User click on the 'Отправить' button ");
	}
}
