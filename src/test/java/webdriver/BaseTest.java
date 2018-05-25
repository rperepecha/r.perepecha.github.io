package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import forms.LoginForm;
import forms.Navigate;

/**
 * An abstract class that describes the basic test application contains
 * methods for logging and field test settings (options)
 */
public abstract class BaseTest extends BaseEntity {
    public void login()  {
        //Ввод логин и пароля для входа на страницу
        LoginForm loginForm = new LoginForm();
        loginForm.loginField.type("+375295311188");
        loginForm.passwordField.type("r291293");

        Actions builder = new Actions(browser.getDriver());
        WebElement btn = browser.getDriver().findElement(By.id("login_button"));
        builder.moveToElement(btn, 105, 35).click().build().perform();
        loginForm.loginBtn.click();
        //Переход на "Моя страница"
        Navigate userPage = new Navigate();
        userPage.myPageBtn.click();
    }
    /**
     * To override.
     */
    public abstract void runTest();

    /**
     * Test
     *
     * @throws Throwable Throwable
     */
    @Test
    public void xTest() throws Throwable {
        Class<? extends BaseTest> currentClass = this.getClass();

        try {
            logger.logTestName(currentClass.getName());
            browser.navigate(Browser.getBaseUrl());
            runTest();
            logger.logTestEnd(currentClass.getName());
        } catch (Throwable e) {

            logger.warn("");
            logger.warn(getLoc("loc.test.failed"));
            logger.warn("");
            logger.fatal(e.getMessage());
        }

    }

    /**
     * Format logging
     *
     * @param message Message
     * @return Message
     */
    protected String formatLogMsg(final String message) {
        return message;
    }

}
