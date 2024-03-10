package DeviceCapabilities;

import BaseClasses.TestBase;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DeviceCaps extends TestBase {

    public static void SamsungA32() {
        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("udid", "RZ8T30532KZ");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("deviceName", "samsung SM-A325F");
        caps.setCapability("app", System.getProperty("user.dir") + "/src/test/java/Resources/app-release.apk");
//        caps.setCapability("appPackage", "com.example.testapp");
//        caps.setCapability("appActivity", "com.example.testapp.MainActivity");
        caps.setCapability("appium:disableIdLocatorAutocompletion", true);
        caps.setCapability("newCommandTimeout", 30);
//        caps.setCapability("fullReset", true);
        caps.setCapability("noReset", false);
    }
    public static void Emulator() {
        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("udid", "emulator-5556");
        caps.setCapability("automationName", "UiAutomator2");
//        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("deviceName", "Toyinemulator");
        caps.setCapability("app", System.getProperty("user.dir") + "/src/test/java/Resources/app-release.apk");
//        caps.setCapability("appPackage", "com.example.testapp");
//        caps.setCapability("appActivity", "com.example.testapp.MainActivity");
        caps.setCapability("appium:disableIdLocatorAutocompletion", true);
        caps.setCapability("newCommandTimeout", 30);
//        caps.setCapability("fullReset", true);
        caps.setCapability("noReset", false);
    }
    public static void YourPhone() {
        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("udid", "");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "");
        caps.setCapability("deviceName", "");
        caps.setCapability("app", System.getProperty("user.dir") + "/src/test/java/Resources/app-release.apk");
//        caps.setCapability("appPackage", "com.example.testapp");
//        caps.setCapability("appActivity", "com.example.testapp.MainActivity");
        caps.setCapability("appium:disableIdLocatorAutocompletion", true);
        caps.setCapability("newCommandTimeout", 30);
//        caps.setCapability("fullReset", true);
        caps.setCapability("noReset", false);
    }
}
