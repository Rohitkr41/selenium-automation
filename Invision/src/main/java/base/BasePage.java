package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // 👇 ADD THIS METHOD
    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}



//package base;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class BasePage {
//
//    protected WebDriver driver;
//    protected WebDriverWait wait;
//
//    public BasePage(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }
//
//    public void click(WebElement element) {
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//        element.click();
//    }
//
//    public void sendKeys(WebElement element, String text) {
//        wait.until(ExpectedConditions.visibilityOf(element));
//        element.clear();
//        element.sendKeys(text);
//    }
//
//    public void waitForVisibility(WebElement element) {
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
//
//    // ✅ ADD THIS HERE
//    public String getPageUrl() {
//        return driver.getCurrentUrl();
//    }
//}
