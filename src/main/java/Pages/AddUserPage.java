package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends PageBase{
    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6")
    WebElement addUserScreenTitle;

    public String getAddUserScreenTitle() {
        return addUserScreenTitle.getText();
    }
}
