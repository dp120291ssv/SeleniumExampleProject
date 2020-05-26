package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.authorization.AuthorizationPage;

public class BaseTest {

	protected CommonActions commonActions = CommonActions.getInstance();
	protected WebDriver driver = commonActions.driver;
	protected BasePage basePage = new BasePage(driver);
	protected AuthorizationPage authorizationPage = new AuthorizationPage(driver);
}