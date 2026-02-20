//package listeners;
//
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import factory.DriverFactory;
//import utils.ScreenshotUtil;
//
//public class TestListener implements ITestListener {
//
//    public void onTestFailure(ITestResult result) {
//
//        ScreenshotUtil.captureScreenshot(
//            DriverFactory.getDriver(),
//            result.getName()
//        );
//    }
//}
