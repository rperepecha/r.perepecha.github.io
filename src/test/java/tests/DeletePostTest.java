package tests;

import forms.MyPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import webdriver.BaseTest;
import webdriver.Browser;

public class DeletePostTest extends BaseTest {
	private static final String VALUE4 = "Измененный текст";

	@Override
	public void runTest() {
		//Ввод логин и пароля для входа на страницу
		login();
		//Редактирование поста
		MyPage myPage = new MyPage();
		Actions action = new Actions(Browser.getInstance().getDriver());
		action.moveToElement(myPage.dropDownMenuButton.getElement()).build().perform();
		myPage.deleteBtn.click();
		//test failed
		String text2 = myPage.firstPost.getText();
		AssertJUnit.assertTrue("Поиск некорректен", text2.contains(VALUE4));
		logger.info(String.format("Результат поиска не содержит", VALUE4));
	}

}
