package forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class LoginForm extends BaseForm {
	private static final String formLocator = "//body[@class='firefox login_page']";
	public TextBox loginField = new TextBox(By.xpath("//form[@id='login_form']//input[@id='email']"), "Поле ввода телефона");
	public TextBox passwordField = new TextBox(By.xpath("//form[@id='login_form']//input[@id='pass']"), "Поле ввода пароля");
	public Button loginBtn = new Button(By.xpath("//div[@id='login_form_wrap']//div[@class='login_buttons_wrap']//button[@id='login_button']"));

	public LoginForm() {

		super(By.xpath(formLocator), "Поиск в работе");
	}

}
