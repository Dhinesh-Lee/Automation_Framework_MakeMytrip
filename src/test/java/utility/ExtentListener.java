package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ExtentListener implements ITestListener {

    ExtentReports extent = ExtentManager.getReportInstance();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentManager.test =
                extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentManager.test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        try {

            String path =
                    ScreenshotUtil.captureScreenshot(result.getName());

            ExtentManager.test
                    .fail(result.getThrowable())
                    .addScreenCaptureFromPath(path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        ExtentManager.test.skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}