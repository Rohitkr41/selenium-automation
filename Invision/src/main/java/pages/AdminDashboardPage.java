package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class AdminDashboardPage extends BasePage {

    public AdminDashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Dashboard menu (left side active)
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    private WebElement dashboardMenu;

    public boolean isDashboardDisplayed() {
        waitForVisibility(dashboardMenu);
        return dashboardMenu.isDisplayed();
    }
}
