package baseTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import reports.ExtentManager;

public class BaseTest {

    public static ExtentReports extent;
    public static ExtentTest test;

    public static void setupReport() {
        extent = ExtentManager.getReportObject();
    }

    public static void flushReport() {
        extent.flush();
    }
}