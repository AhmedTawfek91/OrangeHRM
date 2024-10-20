package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends PageBase{
    public AdminPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]")
    WebElement adminScreenTitle;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    WebElement addUserBtn;

    public String getAdminScreenTitle() {
        return adminScreenTitle.getText();
    }

    public void clickAddUserBtn() {
        addUserBtn.click();
    }
}
