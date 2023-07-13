
package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.JsonFormatter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.Homepage;
import utils.Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class TestBase {
    private static final String JSON_ARCHIVE = "target/json/jsonArchive.json";
    public static Properties properties;
    public static org.openqa.selenium.WebDriver driver;
    public static Utils utils = new Utils();
    public static Date date = new Date();
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
    public static String dt = formatter.format(date);
    public static FileReader fileReader;
    public static ExtentSparkReporter spark;
    public static ExtentTest test;
    public static ExtentReports extent;
    public static JsonFormatter json;
    public static String reportDestination = "reports/report_" + dt + ".html";
    protected final Logger logger = LogManager.getLogger(getClass());

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws IOException {
        propertiesLoad();

        extentReportSpark();
        openBrowser();
    }
    @AfterSuite(alwaysRun = true)
    public void tearDown()  {

        driver.quit();
        extent.flush();
    }
    @AfterMethod
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getName() + " test case is failed. " + "<span class='badge badge-danger'> Fail </span>" + result.getThrowable());
            test.fail(new Throwable());
            test.fail(new Exception());

        } else if (result.getStatus() == ITestResult.SKIP) {
            test.skip(result.getName() + " test case is skipped." + "<span class='badge badge-warning'> Skip </span>");

        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass(result.getName() + " test case is Passed." + "<span class='badge badge-success'> Success </span>");
        }
    }
    public static void extentReportSpark() {

        spark = new ExtentSparkReporter(reportDestination);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        json = new JsonFormatter(JSON_ARCHIVE);

        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Browser Name", properties.getProperty("BrowserName"));
        extent.setSystemInfo("Environment", properties.getProperty("Environment"));
        extent.setSystemInfo("Base URL", properties.getProperty("URL"));

        spark.config().setDocumentTitle("Sample Automation Testing Report");
        spark.config().setReportName("Sample Automation Test Suite");
        spark.config().setTimelineEnabled(Boolean.TRUE);
        spark.config().setOfflineMode(Boolean.TRUE);
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        spark.config().setTimelineEnabled(Boolean.TRUE);
    }
    public static void propertiesLoad() throws IOException {

        try {
            fileReader = new FileReader("config/QA.properties");
            properties = new Properties();
            properties.load(fileReader);

        } catch (FileNotFoundException ex) {
            test.info("*************************************************");
            test.info("Property file you are looking for does not exist.");
            test.info("*************************************************");
        }
    }

    public static void openURL(String url) {

        driver.get(url);
    }

    public static void openBrowser() {

        if (properties.getProperty("BrowserName").equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.logfile", "./logs/chromeLogs.txt");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } else if (properties.getProperty("BrowserName").equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "./logs/FirefoxLogs.txt");
            FirefoxOptions options = new FirefoxOptions();
            options.setLogLevel(FirefoxDriverLogLevel.TRACE);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
    }
    public void AssertFunction(){
        String ActualURL = driver.getCurrentUrl();
        String ExpectedURL ="https://www.nichiduta.ro/";
        Assert.assertEquals(ExpectedURL,ActualURL);
if(ActualURL=="https://www.nichiduta.ro/campanie/"){
            Utils.clickOnButton(Homepage.RETURNbtn);
}
    }
}