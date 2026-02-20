
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
        loginPage.login("username", "password");

        LocationMasterPage locationPage = new LocationMasterPage(driver);

        locationPage.openLocationMasters();

        Assert.assertTrue(locationPage.isCountryVisible(),
                "Location Masters dropdown did not expand!");

        System.out.println("Location Masters dropdown working properly");
    }
}
