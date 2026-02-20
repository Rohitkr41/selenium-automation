package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );

        System.out.println("Login Successful");
    }
}


//package tests;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import base.BaseTest;
//import pages.AdminDashboardPage;
//import pages.LoginPage;
//
//public class LoginTest extends BaseTest {
//
//    @Test
//    public void verifyLogin() {
//
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login();
//
//        AdminDashboardPage dashboardPage =
//                new AdminDashboardPage(driver);
//
//        Assert.assertTrue(
//                dashboardPage.isDashboardDisplayed(),
//                "Login Failed! Admin Dashboard not displayed."
//        );
//    }
//}
