package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver, String testName) {

        File src = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        File destination = new File("screenshots/" + testName + ".png");

        destination.getParentFile().mkdirs();

        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
