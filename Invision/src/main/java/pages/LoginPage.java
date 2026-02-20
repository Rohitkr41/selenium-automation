package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By username = By.name("loginModel.Username");
    By password = By.name("loginModel.Password");
    By loginBtn = By.xpath("//button[@type='submit']");

    public void login(String user, String pass) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pass);
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
}



//package pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import base.BasePage;
//import utils.ConfigReader;
//
//public class LoginPage extends BasePage {
//
//    public LoginPage(WebDriver driver) {
//        super(driver);
//        PageFactory.initElements(driver, this);
//    }
//
//    @FindBy(name = "loginModel.Username")
//    private WebElement username;
//
//    @FindBy(name = "loginModel.Password")
//    private WebElement password;
//
//    @FindBy(xpath = "//button[.='Login']")
//    private WebElement loginBtn;
//
//    public void login() {
//
//        sendKeys(username, "SuperAdmin");
//        sendKeys(password, "Super@123");
//
//        String env = ConfigReader.getProperty("environment");
//
//        if (env.equalsIgnoreCase("QA")) {
//            System.out.println("QA Environment → Captcha Disabled");
//        } else {
//            System.out.println("Non-QA → Handle Captcha");
//        }
//
//       click(loginBtn);
//    }
//}
