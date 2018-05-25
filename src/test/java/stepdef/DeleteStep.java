package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteStep {

	@When("^User click on the \"([^\"]*)\" button$")
	public void user_click_on_the_button(String arg1) throws Throwable {
		System.out.println("User click on the 'Удалить' button ");
	}

	@Then("^User see deleated post$")
	public void user_see_deleated_post() throws Throwable {
		System.out.println("User see deleted post");
	}

}
