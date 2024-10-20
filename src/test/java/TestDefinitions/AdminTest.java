package TestDefinitions;

import Pages.AddUserPage;
import Pages.AdminPage;
import Tests.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AdminTest extends TestBase {

    AdminPage adminPage;
    AddUserPage addUserPage;

    @When("User click on the Add user button")
    public void user_click_on_the_Add_user_button() {
        adminPage = new AdminPage(TestBase.driver);
        adminPage.clickAddUserBtn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User directed to Add user screen")
    public void ASSERT_user_directed_to_Add_user_screen() {
        addUserPage = new AddUserPage(TestBase.driver);
       String ADD_USER_SCREEN_TITLE =  addUserPage.getAddUserScreenTitle();
        Assert.assertTrue(ADD_USER_SCREEN_TITLE.contains("Add User"));
    }

}
