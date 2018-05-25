package forms;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import webdriver.BaseTest;

public class VKTest extends BaseTest {

	@Override
	public void runTest() {

		LoginForm loginForm = new LoginForm();
		loginForm.loginField.type("+375295311188");
		loginForm.passwordField.type("perepecharoman291293");

		Actions builder = new Actions(browser.getDriver());
		WebElement btn = browser.getDriver().findElement(By.xpath("//div[@id='login_form_wrap']//div[@class='login_buttons_wrap']//button[@id='login_button']"));
		builder.moveToElement(btn, 105, 35).click().build().perform();
		loginForm.loginBtn.click();

		Navigate userPage = new Navigate();
		userPage.myPageBtn.click();


	}

}


