
package pages.location;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationMasterPage {

    WebDriver driver;
    WebDriverWait wait;

    public LocationMasterPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Location Masters dropdown
    By locationMastersMenu = By.xpath("//*[contains(text(),'Location Masters')]");

    // Submenus
    By countryMenu  = By.xpath("//*[normalize-space()='Country']");
    By districtMenu = By.xpath("//*[normalize-space()='District']");
    By upazilaMenu  = By.xpath("//*[normalize-space()='Upazila']");
    By unionMenu    = By.xpath("//*[normalize-space()='Union']");
    By villageMenu  = By.xpath("//*[normalize-space()='Village']");

    // Open dropdown
    public void openLocationMasters() {
        wait.until(ExpectedConditions.elementToBeClickable(locationMastersMenu)).click();
    }

    // Visibility checks
    public boolean isCountryVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(countryMenu)).isDisplayed();
    }

    public boolean isDistrictVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(districtMenu)).isDisplayed();
    }

    public boolean isUpazilaVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(upazilaMenu)).isDisplayed();
    }

    public boolean isUnionVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(unionMenu)).isDisplayed();
    }

    public boolean isVillageVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(villageMenu)).isDisplayed();
    }
}
