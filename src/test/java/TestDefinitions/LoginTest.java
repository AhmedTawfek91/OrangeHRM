package TestDefinitions;

import Pages.LoginPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Utils.Constants.*;

public class LoginTest extends TestBase {

    LoginPage loginPage;

    @When("Enter valid user name and password")
    public void enterValidUserNameAndPassword() {
        loginPage = new LoginPage(TestBase.driver);
        loginPage.enterUserName(USERNAME);
        loginPage.enterPassword(PASSWORD);
        loginPage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User login to the Website successfully")
    public void ASSERT_userLoginToTheWebsite() {
        String CURRENT_URL = driver.getCurrentUrl();
        Assert.assertTrue(CURRENT_URL.contains("web"));
    }

    @When("Enter invalid password for login")
    public void enterInvalidPasswordForLogin() {
        loginPage = new LoginPage(TestBase.driver);
        loginPage.enterUserName(USERNAME);
        loginPage.enterPassword(WRONG_PASSWORD);
        loginPage.clickLoginButton();
    }

    @Then("User failed to login")
    public void ASSERT_userFailedToLogin() {
        String INVALID_LOGIN_MESSAGE = loginPage.getInvalidCredentialsMessage();
        Assert.assertTrue(INVALID_LOGIN_MESSAGE.contains("Invalid credentials"));
    }
}
