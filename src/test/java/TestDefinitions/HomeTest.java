package TestDefinitions;

import Pages.AdminPage;
import Pages.HomePage;
import Pages.LoginPage;
import Tests.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomeTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    AdminPage adminPage;

    @When("User click on user profile button")
    public void user_click_on_user_profile_button() {
        homePage = new HomePage(TestBase.driver);
        homePage.clickOnUserProfileBtn();
    }

    @And("User click on logout button")
    public void user_click_on_logout_button() {
        homePage = new HomePage(TestBase.driver);
        homePage.clickOnLogoutBtn();
    }

    @Then("User logged out successfully")
    public void ASSERT_user_logged_out_successfully() {
        loginPage = new LoginPage(TestBase.driver);
        String LOGIN_SCREEN_TITLE = loginPage.getLoginScreenTitle();
        Assert.assertTrue(LOGIN_SCREEN_TITLE.contains("Login"));
    }

    @When("User click on Admin button")
    public void user_click_on_Admin_button() {
        homePage = new HomePage(TestBase.driver);
        homePage.clickOnAdminBtn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User directed to Admin screen")
    public void ASSERT_user_directed_to_Admin_screen() {
        adminPage = new AdminPage(TestBase.driver);
        String ADMIN_SCREEN_TITLE = adminPage.getAdminScreenTitle();
        Assert.assertTrue(ADMIN_SCREEN_TITLE.contains("Admin"));
    }
}
