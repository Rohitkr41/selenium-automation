//package tests.location;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import base.BaseTest;
//import pages.LoginPage;
//import pages.location.LocationMasterPage;
//import utils.ConfigReader;
//
//public class LocationMasterTest extends BaseTest {
//
//    @Test
//    public void verifyLocationMasterDropdown() {
//
//        LoginPage login = new LoginPage(driver);
//        login.login(
//                ConfigReader.getProperty("username"),
//                ConfigReader.getProperty("password"));
//
//        LocationMasterPage location = new LocationMasterPage(driver);
//        location.clickLocationMasters();
//
//        Assert.assertTrue(location.isCountryVisible(),
//                "Dropdown not working!");
//    }
//}


package tests.location;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.location.LocationMasterPage;

public class LocationMasterTest extends BaseTest {

    @Test
    public void verifyLocationMasterDropdown() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("superAdmin", "Super@123");

        LocationMasterPage locationPage = new LocationMasterPage(driver);

        locationPage.openLocationMasters();

        Assert.assertTrue(locationPage.isCountryVisible(),
                "Location Masters dropdown did not expand!");

        System.out.println("Location Masters dropdown working properly");
    }
}
