package forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class Navigate extends BaseForm {
	private static final String formMain = "//div[@id='page_header']//div[@class='top_home_logo']";
	public Button myPageBtn = new Button(By.xpath("//div[@id='side_bar_inner']//li[@id='l_pr']//a[@class='left_row']//span[@class='left_fixer']"));
















	public Navigate() {

		super(By.xpath(formMain), "Поиск в работе");
	}



}
