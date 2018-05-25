package tests;

import org.testng.AssertJUnit;
import forms.MyPage;
import webdriver.BaseTest;

public class NewPostTest extends BaseTest {
	private static final String VALUE3 = "Это тест на ввод данных для поста";

	@Override
	public void runTest() {
		//Ввод логин и пароля для входа на страницу
		login();
		//Создание нового поста
		MyPage myPage = new MyPage();
		myPage.articleEnter.type(VALUE3);
		myPage.postBtn.click();

		String text = myPage.firstPost.getText();
		AssertJUnit.assertTrue("Поиск некорректен", text.contains(VALUE3));
		logger.info(String.format("Результат поиска содержит", VALUE3));
	}

}
