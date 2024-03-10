package BaseClasses;

import DeviceCapabilities.DeviceCaps;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    String testDate_filePath = "testData.properties";
    public Properties testData;
    FileInputStream fis;
    public static AndroidDriver driver;
    public static DesiredCapabilities caps;
    private static Logger log = LogManager.getLogger(TestBase.class);

    public TestBase() {
        loadPropFile();
    }

    public void loadPropFile() {
        testData = new Properties();
        try {
            fis = new FileInputStream(testDate_filePath);
            testData.load(fis);
        } catch (IOException e) {
            log.error("Something went wrong while reading properties file");
        }
    }

    public static void mainSetup() {
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        } catch (MalformedURLException e) {
            log.fatal("An error has occurred, kindly check the provided server URL");
        }
    }

    @BeforeClass
    public void setup() {
        String device = testData.getProperty("device1");// Change the parameter to "device3" and configure your device in src/test/java/DeviceCapabilities/DeviceCaps.java class file

        switch (device) {
            case "SamsungA32":
                DeviceCaps.SamsungA32();
                mainSetup();
                break;
            case "Emulator":
                DeviceCaps.Emulator();
                mainSetup();
                break;
            case "YourPhone":
                DeviceCaps.YourPhone();
                mainSetup();
                break;
            default:
                throw new IllegalArgumentException("The phone selected is not configured");
        }
    }
    public void validateText(WebElement element, String message) {
        String actualMessage = "";
        try {
            actualMessage = element.getAttribute("content-desc");
            Assert.assertTrue(actualMessage.equals(message));
        } catch (AssertionError | NoSuchElementException e) {
            if (e.getMessage().contains("Can't locate an element")) {
                log.error(e.getMessage());
            } else {
                log.error("Expect " + message + " to equal " + actualMessage);
            }
            throw new AssertionError();
        }
    }
    public void validateAttribute(WebElement element, String attribute, boolean value) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            Assert.assertTrue(Boolean.parseBoolean(element.getAttribute(attribute)) == value);
        } catch (Exception e) {
            log.error("Element cannot be found on the screen");
            throw new AssertionError(e);
        }
    }

    public void sleep(int seconds) {
        try{
            Thread.sleep(Duration.ofSeconds(seconds));
        }catch (InterruptedException e) {

        }
    }

    @AfterClass
    public void tearDown() {
        if(null != driver) {
            driver.quit();
        }
    }
}
