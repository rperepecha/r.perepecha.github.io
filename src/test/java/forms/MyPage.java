package forms;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class MyPage extends BaseForm {

	private static final String formMain = "//div[@id='page_header']//div[@class='top_home_logo']";

	public TextBox articleEnter = new TextBox(By.xpath("//div[@id='submit_post_box']//div[@class = 'post_field_wrap _emoji_field_wrap']//div[@id='post_field']"), "Ввод текста поста");
	public Button postBtn = new Button(By.xpath("(//div[@id = 'wide_column']//div[@class = 'page_block']//div[@id='submit_post']//button[@id = 'send_post'])[1]"), "Нажать кнопку отправить");
	public Label firstPost = new Label(By.xpath("((//div[@id='profile_wall']//div[@id='page_wall_posts']//div)[1])//div[@class='post_content']//div[@class='wall_text']"));
	public Button dropDownMenuButton = new Button(By.xpath("//div[@id='profile_wall']//div[@id='page_wall_posts']//div[1]//div[@class='ui_actions_menu_icons']"), "Открыть быстрое меню");
	public Button editPostBtn = new Button(By.xpath("((//div[@id='profile_wall']//div[@id='page_wall_posts']//div)[1])//div[@class='ui_actions_menu _ui_menu']//a[text()='Редактировать']"), "Нажать кнопку редактировать");
	public Button deleteBtn = new Button(By.xpath("((//div[@id='profile_wall']//div[@id='page_wall_posts']//div)[1])//div[@class='ui_actions_menu _ui_menu']//a[text()='Удалить запись']"), "Нажать кнопку удалить запись");
	public TextBox editArticleEnter = new TextBox(By.xpath("((//div[@id='profile_wall']//div[@id='page_wall_posts']//div)[1])//div[@class='_post_content']//div[@class='post_content']//div[@class='clear_fix']//div[@class='wpe_text_cont _emoji_field_wrap']//div[@id='wpe_text']"), "Ввод текста исправленного поста");
	public Button saveBtn = new Button(By.xpath("((//div[@id='profile_wall']//div[@id='page_wall_posts']//div)[1])//div[@class='wall_text']//div[@class='wpe_buttons']//button[@id='wpe_save']"), "Нажать кнопку сохранить");

	public MyPage() {

		super(By.xpath(formMain), "Поиск в работе");
	}
public void assertPostResultIsorrect(String value){
		String text = firstPost.getText();

}

}
