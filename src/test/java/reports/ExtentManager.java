	package reports;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class ExtentManager {

	    public static ExtentReports extent;

	    public static ExtentReports getReportObject() {

	        String path = System.getProperty("user.dir") + "/reports/index.html";

	        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	        reporter.config().setReportName("API Automation Results");
	        reporter.config().setDocumentTitle("API Test Report");

	        extent = new ExtentReports();
	        extent.attachReporter(reporter);

	        extent.setSystemInfo("Tester", "Neha");
	        extent.setSystemInfo("Framework", "Rest Assured API");

	        return extent;
	    }
	}
	
